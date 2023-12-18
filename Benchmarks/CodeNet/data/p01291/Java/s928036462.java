import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	private static final Scanner IN = new Scanner(System.in);
	
	private static final double INFINITE = 1e16;
	private static final double EPS = 1e-8;
	
	class Path implements Comparable<Path> {
		
		private double length;
		private int vertex;
		
		private Path(double length, int vertex) {
			
			this.length = length;
			this.vertex = vertex;
		}

		@Override
		public int compareTo(Path object) {
			
			return Double.compare(length, object.length);
		}
	}
	
	private final double[] shortest = new double[MAX_N];
	private final PriorityQueue<Path> que = new PriorityQueue<Path>(MAX_N * MAX_N);
	
	private void dijkstra() {
		
		que.clear();
		Arrays.fill(shortest, 0, n, INFINITE);
		
		shortest[n - 2] = 0;
		que.add(new Path(shortest[n - 2], n - 2));
		
		while (!que.isEmpty()) {
			
			Path path = que.remove();
			if (Math.abs(shortest[path.vertex] - path.length) > EPS) {
				
				continue;
			}
			if (path.vertex == n - 1) {
				
				break;
			}
			
			for (int i = 0; i < n; i ++) {
				
				double length =
					shortest[path.vertex] + distance[path.vertex][i];
				if (shortest[i] > length) {
					
					shortest[i] = length;
					que.add(new Path(shortest[i] ,i));
					
				}
			}
		}
	}
	
	private static final int X = 0, Y = 1;
	
	private static double absSq(double a[]) {
		
		return a[X] * a[X] + a[Y] * a[Y];
	}
	
	private static double abs(double a[]) {
		
		return Math.sqrt(absSq(a));
	}
	
	private static double[] subtractPoint(double a[], double b[]) {
		
		return new double[] {a[X] - b[X], a[Y] - b[Y]};
	}
	
	private static double innerProduct(double a[], double b[]) {
		
		return a[X] * b[X] + a[Y] * b[Y];
	}
	
	private static double outerProduct(double a[], double b[]) {
		
		return a[X] * b[Y] - a[Y] * b[X];
	}
	
	private static double distanceLinePoint(double a[][], double b[]) {
		
		double a1_a0[] = subtractPoint(a[1], a[0]);
		return Math.abs(outerProduct(a1_a0, subtractPoint(b, a[0]))) / abs(a1_a0);
	}
	
	private static double distanceSegmentPoint(double a[][], double b[]) {
		
		double b_a0[] = subtractPoint(b, a[0]);
		if (innerProduct(subtractPoint(a[1], a[0]), b_a0) < EPS) {
			
			return abs(b_a0);
		}
		
		double b_a1[] = subtractPoint(b, a[1]);
		if (innerProduct(subtractPoint(a[0], a[1]), b_a1) < EPS) {
			
			return abs(b_a1);
		}
		
		return distanceLinePoint(a, b);
	}
	
	private static double distanceSegment(double a[][], double b[][]) {
		
		double distance = distanceSegmentPoint(a, b[0]);
		distance = Math.min(distance, distanceSegmentPoint(a, b[1]));
		distance = Math.min(distance, distanceSegmentPoint(b, a[0]));
		distance = Math.min(distance, distanceSegmentPoint(b, a[1]));
		
		return distance;
	}
	
	private static double distanceConvexHull(double a[][], int aVertexN, double b[][], int bVertexN) {
		
		double distance = Double.MAX_VALUE;
		for (int i = 0; i < aVertexN; i ++) {
			
			for (int j = 0; j < bVertexN; j ++) {
				
				distance = Math.min(distance,
						distanceSegment(new double[][] {a[i], a[(i + 1) % aVertexN]},
								new double[][] {b[j], b[(j + 1) % bVertexN]}));
			}
		}
		
		return distance;
	}
	
	private final double[][] distance = new double[MAX_N][MAX_N];
	
	private void distance() {
		
		for (int i = 0; i < n; i ++) {
			
			for (int j = i + 1; j < n; j ++) {
				
				distance[i][j] = distance[j][i] =
					distanceConvexHull(polygon[i], m[i], polygon[j], m[j]);
			}
		}
	}
	
	private static final int MAX_N = 202, MAX_M = 40;
	
	private int w, n;
	private final int m[] = new int[MAX_N];
	private final double polygon[][][] = new double[MAX_N][MAX_M][2];
	
	private void run() {
		
		while(((w = IN.nextInt()) | (n = IN.nextInt())) != 0) {
			
			for (int i = 0; i < n; i ++) {
				
				m[i] = IN.nextInt();
				for (int j = 0; j < m[i]; j ++) {
					
					polygon[i][j][X] = IN.nextInt();
					polygon[i][j][Y] = IN.nextInt();
				}
			}
			
			m[n] = m[n + 1] = 2;
			polygon[n][0][X] = polygon[n][1][X] = 0;
			polygon[n + 1][0][X] = polygon[n + 1][1][X] = w;
			polygon[n][0][Y] = polygon[n + 1][0][Y] = - INFINITE;
			polygon[n][1][Y] = polygon[n + 1][1][Y] = INFINITE;
			n+=2;
			
			distance();
			
			dijkstra();
			
			System.out.println(shortest[n - 1]);
		}
	}
	
	public static void main(String[] args) {
		
		new Main().run();
	}
}