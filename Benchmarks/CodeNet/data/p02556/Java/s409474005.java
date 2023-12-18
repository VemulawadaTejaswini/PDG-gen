import java.util.*;


public class Main {
  	public static class Point implements Comparable<Point>{
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
      
      	@Override
        public String toString() {
            return "x: " + x + " y: " + y; 
        }

        @Override
        public int compareTo(Point o) {
            if( x < o.x ) {
                return -1;
            }
            return 1;
        }
	}
  	
  	public static int dis(Point a, Point b) {
    	return Math.abs(a.x - b.x)  + Math.abs(a.y - b.y);
    } 

	public static void main(String[] args) {
    	Scanner sn = new Scanner(System.in);
      	int n = sn.nextInt();
      	Point[] points = new Point[n];
      	int x,y;
      	for(int i =0; i < n; i++) {
        	x = sn.nextInt();
          	y = sn.nextInt();
          	points[i] = new Point(x,y);
        }
      	Arrays.sort(points);
      	Point aux = null;
      	int max = 0;
      	int j = 1;
      	for(int i = 1; i < n; i++) {	
          	int di = dis(points[i], points[i-j]);
          	if( di > max) {
            	max = di;
              	// aux = points[i];
              	j = 1;
            } else {
            	j = j + 1;
            }
        }
            	
      	System.out.println(max);
    }
}
 