import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO ?????????????????????????????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int n = Integer.parseInt(br.readLine());
         
        //PointArray parray = new PointArray(n);
        Point[] pArray = new Point[n];
         
        for(int i = 0; i < n; i++){
            String[] tmpArray = br.readLine().split(" ");
            int x = Integer.parseInt(tmpArray[0]);
            int y = Integer.parseInt(tmpArray[1]);
             
//            parray.addPoint(x, y);
            pArray[i] = new Point(x, y);
        }
         
        TwoDTree tree = new TwoDTree(pArray, n);
        int q = Integer.parseInt(br.readLine());
         
        for(int i = 0; i < q; i++){
            String[] tmpArray = br.readLine().split(" ");
            int sx = Integer.parseInt(tmpArray[0]);
            int tx = Integer.parseInt(tmpArray[1]);
            int sy = Integer.parseInt(tmpArray[2]);
            int ty = Integer.parseInt(tmpArray[3]);
            Rectangle2D.Double rect = new Rectangle2D.Double(sx, sy, tx - sx, ty - sy);
             
            ArrayList<Integer> list = new ArrayList<Integer>();
            tree.inRange(tree.head, rect, true, list);
            
            Collections.sort(list);
            
            for(int j = 0; j < list.size() ; j++){
            	System.out.println(list.get(j));
            }
            System.out.println();
            //parray.printPoint(sx, tx, sy, ty);
            //System.out.println(rect.contains(new Point2D.Double(4,2)));
        }
 
    }
 
}
 
class PointArray {
    private Point[] array;
    private int currentIndex = 0;
     
    public PointArray(int n){
        array = new Point[n];
    }
     
    public void addPoint(int x, int y){
        array[currentIndex] = new Point(x, y);
        currentIndex++;
    }
     
    public void printPoint(int x1, int x2, int y1, int y2){
        int count = 0;
         
        for(int i = 0; i < array.length ; i++){
            Point p = array[i];
            if(p.x >= x1 && p.x <= x2 && p.y >= y1 && p.y <= y2){
                System.out.println(i);;
            }
        }
         
        if(count == 0){
            System.out.println();
        }
    }
}

class TwoDTree {
	Node head;
	Node t;
	Node z;
	
	public TwoDTree(Point[] parray, int n){
//		int i;
		Point pzero = new Point(0, 0);
		pzero.info = 0;
		z = new Node(pzero);
		head = new Node(null);
		head.right = z;
		head.point = pzero;
		for(int i = 0; i < n; i++){
			insert(parray[i]);
		}
	}
	
	void insert (Point p){
		Node f = null;
		boolean d, td = false;
		
		for(d = false, t = head; t != z ; d = !d){
			if(d){
				td = p.x < t.point.x;
			}
			else {
				td = p.y < t.point.y;
			}
			f = t;
			if(td){
				t = t.left;
			}
			else {
				t = t.right;
			}
		}
		
		t = new Node(p);
		t.left = z;
		t.right = z;
		
		if(td){
			f.left = t;
		}
		else {
			f.right = t;
		}
		
		//System.out.println("INSERTED");
	}
	
	void inRange(Node t, Rectangle2D.Double rect, boolean d, ArrayList<Integer> list) {
		//System.out.println("CURRENT NODE POINT ("+t.point.x+","+t.point.y+")");
		boolean t1, t2, tx1, tx2, ty1, ty2;
		if(t == z){
			return;
		}
		tx1 = rect.x < t.point.x;
		tx2 = t.point.x <= rect.x + rect.width;
		ty1 = rect.y < t.point.y;
		ty2 = t.point.y <= rect.y + rect.height;
		t1 = d ? tx1 : ty1;
		t2 = d ? tx2 : ty2;
		if(t1){
			//System.out.println("SEARCH LEFT");
			inRange(t.left, rect, !d, list);
		}
//		if(rect.contains(t.point.toPoint2d())){
		if(rect.x <= t.point.x && rect.x + rect.width >= t.point.x
				&& rect.y <= t.point.y && rect.y + rect.height >= t.point.y){
			//INSIDE!
			//System.out.println("POINT "+t.point.id+" INSIDE");
			list.add(t.point.id);
		}
		if(t2){
			//System.out.println("SEARCH RIGHT");

			inRange(t.right, rect, !d, list);
		}
	}

}

class Node {
	Point point;
	Node right;
	Node left;
	
	public Node(Point p){
		point = p;
		right = null;
		left = null;
	}
}

interface IMultiPoint {
	int dimensionality();
	double getCoordinate(int dx);
	double distance(IMultiPoint imp);
	double[] raw();
}
class Point {
    int x;
    int y;
    int info;
    int id;
    private static int idseed = 0;
     
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        
        this.id = idseed;
        idseed++;
    }
    
    public Point2D.Double toPoint2d(){
    	return new Point2D.Double(x, y);
    }
}