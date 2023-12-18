import java.awt.geom.*;
import java.io.*;
import java.util.*;
public class Main {
	
	Comparator<Point2D> com = new Comparator<Point2D>() {
		
		@Override
		public int compare(Point2D o1, Point2D o2) {
			if(o1.getX() < o2.getX()) return -1;
			else if(o1.getX() < o2.getX()) return -1;
			else if(o1.getX() > o2.getX()) return 1;
			else if(o1.getY() < o2.getY()) return -1;
			else if(o1.getY() > o2.getY()) return 1;
			else  return 0;
		}
	};
	
	//1644 start
	//1726 sample match
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n | m) == 0) break;
			Point2D [] nlist = new Point2D[n];
			Point2D [] mlist = new Point2D[m];
			for(int i = 0 ; i < n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				nlist[i] = new Point2D.Double(x, y);
			}
			for(int i = 0; i < m; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				mlist[i] = new Point2D.Double(x, y);
			}
			
			if(n == 1 && m == 1){
				System.out.println("YES");
				continue;
			}
			if(n == 1){
				Point2D [] list2 = convexHull(mlist);
				boolean res1 = iscontains(list2, nlist[0]);
				if(res1){
					System.out.println("NO");
				}
				else{
					System.out.println("YES");
				}
				continue;
			}
			else if(m == 1){
				Point2D [] list1 = convexHull(nlist);
				boolean res1 = iscontains(list1, mlist[0]);
				if(res1){
					System.out.println("NO");
				}
				else{
					System.out.println("YES");
				}
				continue;
			}
			
			Point2D [] list1 = convexHull(nlist);
			Point2D [] list2 = convexHull(mlist);
//			System.out.println(Arrays.toString(list1));
//			System.out.println(Arrays.toString(list2));
			
			
			
			boolean res = isintersect(list1, list2);
			if(res){
				System.out.println("NO");
				continue;
			}
			
			//System.out.println(Arrays.toString(list1));
			boolean res1 = iscontains(list1, list2[0]);
			boolean res2 = iscontains(list2, list1[0]);
			if(res1 || res2){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		}
	}
	
	private boolean iscontains(Point2D[] list1, Point2D p) {
		int res = new Line2D.Double(list1[0], list1[1]).relativeCCW(p);
		//System.out.println(res+  " res = "  );
		int n = list1.length;
		for(int i = 0 ; i < n; i++){
			int temp =  new Line2D.Double(list1[i], list1[(i+1) % n]).relativeCCW(p);
			//System.out.println("t = " + temp);
			if(temp * res < 0){
				return false;
			}
		}
		return true;
	}

	private boolean isintersect(Point2D[] list1, Point2D[] list2) {
		int n = list1.length, m = list2.length;
		for(int i = 0 ; i < list1.length; i++){
			for(int j = 0 ; j < list2.length; j++){
				Line2D l1 = new Line2D.Double(list1[i], list1[(i+1) % n]);
				Line2D l2 = new Line2D.Double(list2[j], list2[(j+1) % m]);
				if(l1.intersectsLine(l2)){
					return true;
				}
			}
		}
		return false;
	}

	private Point2D [] convexHull(Point2D [] plist){
		int n = plist.length;
		Arrays.sort(plist, com);
		int k = 0;
		Point2D [] qs = new Point2D[n*2];
		for(int i = 0; i < n; i++){
			while(k > 1 && new Line2D.Double(qs[k-2], qs[k-1]).relativeCCW(plist[i]) > 0){
				k --;
			}
			qs[k++] = plist[i];
		}
		for(int i = n-2, t = k; i >= 0; i--){
			while(k > t && new Line2D.Double(qs[k-2], qs[k-1]).relativeCCW(plist[i]) > 0){
				k--;
			}
			qs[k++] = plist[i];
		}
		Point2D [] res = Arrays.copyOf(qs, k-1);
		return res;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}