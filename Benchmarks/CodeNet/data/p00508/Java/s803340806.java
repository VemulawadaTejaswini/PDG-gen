import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static class Point{
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		int x, y;
	}
	
	public static int[] x_array = new int[800];
	public static int[] y_array = new int[800];
	public static int size = 0;
	
	public static int max_size = 0;
	
	public static int min_dist_2(final int n, final int start, final Point[] points){
		if(n <= 1){
			return Integer.MAX_VALUE;
		}
		
		final int m = n / 2;
		
		int d = Math.min(min_dist_2(m, start, points), min_dist_2(n - m, start + m, points));
		
		size = 0;
		final int x = points[start].x;
		for(int i = 0; i < n; i++){
			final int pos = start + i;
			
			final int tmp_d = (points[pos].x - x) * (points[pos].x - x);
			if(tmp_d >= d){
				continue;
			}
			
			for(int j = 0; j < size; j++){
				final int dx = points[pos].x - x_array[j];
				final int dy = points[pos].y - y_array[j];
				/*
				if(dy > 0 && dy * dy >= d){
					break;
				}
				*/
				d = Math.min(d, dx * dx + dy * dy);
			}
			
			x_array[size] = points[pos].x;
			y_array[size] = points[pos].y;
			size++;
		}
		
		//max_size = Math.max(max_size, size);
		
		return d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		Point[] points = new Point[n];
		
		for(int i = 0; i < n; i++){
			points[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				if(o1.x != o2.x){
					return o1.x - o2.x;
				}else{
					return o1.y - o2.y;
				}
			}
		});
		
		System.out.println(min_dist_2(n, 0, points));
		//System.out.println(max_size);
	}

}