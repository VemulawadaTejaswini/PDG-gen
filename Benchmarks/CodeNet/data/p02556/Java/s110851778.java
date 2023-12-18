import java.util.*;


public class Main {
  	public static class Point implements Comparable<Point>{
        Long x;
        Long y;

        Point(Long x, Long y) {
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
  	
  	public static Long dis(Point a, Point b) {
    	return Math.abs(a.x - b.x)  + Math.abs(a.y - b.y);
    } 

	public static void main(String[] args) {
    	Scanner sn = new Scanner(System.in);
      	int n = sn.nextInt();
      	Point[] points = new Point[n];
      	Long x,y;
      	for(int i =0; i < n; i++) {
        	x = sn.nextLong();
          	y = sn.nextLong();
          	points[i] = new Point(x,y);
        }
      	Arrays.sort(points);
      	Point aux = null;
      	Long max = 0L;
      	int j = 0;
      	for(int i = 1; i < n; i++) {	
          	Long di = dis(points[i], points[i - j - 1]);
          	if( di > max) {
            	max = di;
              	// aux = points[i];
              	j = 0;
            } else {
            	j = j + 1;
            }
        }
      	// System.out.println(dis(points[n - 1], points[n - j -2]) );
      	// System.out.println(dis(points[n - 1], points[n - j - 2]) > max);
      	if(n > 2 && dis(points[n - 1], points[n - j - 2]) > max) {
        	max = dis(points[ n - 1 ], points[ n - j -2]);
        }
      	System.out.println(max);
    }
}
 