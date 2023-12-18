import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
		    points[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(points);
		StringBuilder sb = new StringBuilder();
		for (Point p : points) {
		    sb.append(p).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Point implements Comparable<Point> {
	    int x;
	    int y;
	    
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    
	    public int compareTo(Point another) {
	        if (x == another.x) {
	            return y - another.y;
	        } else {
	            return x - another.x;
	        }
	    }
	    
	    public String toString() {
	        return x + " " + y;
	    }
	}
}

