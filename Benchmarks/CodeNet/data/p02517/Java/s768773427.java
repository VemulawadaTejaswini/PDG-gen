
import java.util.*;
public class Main{
	Scanner sc;
	TreeMap< Integer, LinkedList<Point> > gridv = new TreeMap<Integer,LinkedList<Point>>();
	LinkedList<Point> tmp = new LinkedList<Point>();
    void run() {
        sc = new Scanner(System.in);
        while (true) {
        	int r = sc.nextInt();
        	int c = sc.nextInt();
        	int q = sc.nextInt();
        	if (r==0&&c==0&&q==0) break;
        	SubG subg;
        	if (r*c<250001) {
	        	
	        	for (int i=0;i<r; i++) for (int j=0;j<c;j++) {
	        		int v = sc.nextInt();
	        		Point p = new Point(i,j);
	        		if ( gridv.containsKey(v) ) {
	        			tmp=gridv.get(v);
	        			tmp.add(p);
	//        			for (Point point : tmp) System.out.println(point.x + " " + point.y);
	        			gridv.put(v,tmp);
	        			tmp.clear();
	        		}
	        		else {
	        			tmp.add(p);
	        			gridv.put(v,new LinkedList<Point>(tmp));
	        			tmp.clear();
	        		}
	        	}
//	        	for (Map.Entry<Integer, LinkedList<Point>> entry: gridv.entrySet() ) {
//	        		
//	        		for (Point p: entry.getValue()) System.out.println(entry.getKey() + " " + p.x + " " + p.y ) ;
//	        	}
	        	for (int i=0;i<q;i++) {
	        		subg = new SubG(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() );
	        		boolean f = false;
	        		for (Map.Entry<Integer,LinkedList<Point>> entry: gridv.entrySet() ) {
	        			for (Point p: entry.getValue() ) {
		        			if ( p.x >= subg.x1 && p.x <= subg.x2 && p.y >= subg.y1 && p.y <= subg.y2) {
		        				System.out.println( entry.getKey() );
		        				f = true;
		        				break;
		        			}
		        		}
		        		if (f) break;
	        		}
	        	}
	        	for (Map.Entry<Integer,LinkedList<Point>> entry: gridv.entrySet() ) entry.getValue().clear();
			}
			else {
        		int[][] grid = new int[r][c];
				for (int i=0;i<r;i++) for (int j=0;j<c;j++) grid[i][j] = sc.nextInt();
				subg = new SubG(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
				int min = Integer.MAX_VALUE;
				for (int i=subg.x1;i<=subg.x2;i++) for (int j=subg.y1;j<=subg.y2;j++) min = (min < grid[i][j])? min:grid[i][j];
				System.out.println(min);
			}
		}
    }

    public static void main(String[] args) {
        new Main().run();
    }
	class Point {
		int x,y;
		Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	class SubG {
		int x1,x2,y1,y2;
		SubG(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}
}