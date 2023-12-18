import java.util.*;
import java.awt.geom.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Point2D []  plist = new Point2D[n];
			for(int i = 0; i < n; i++){
				String [] a = sc.next().split(",");
				double x = Double.parseDouble(a[0]);
				double y = Double.parseDouble(a[1]);
				plist[i] = new Point2D.Double(x, y);
			}
			

			Point2D [] res = convexHull(plist);
			System.out.println(n - res.length);
		}
	}

	private Point2D [] convexHull(Point2D [] plist) {
		int n = plist.length;
		Comparator< Point2D > com = new Comparator< Point2D >() {
			public int compare(Point2D o1, Point2D o2) {
				if(o1.getX() < o2.getX()) return -1;
				else if(o1.getX() > o2.getX()) return 1;
				else if(o1.getY() < o2.getY()) return -1;
				else if(o1.getY() > o2.getY()) return 1;
				else return 0;
			}
		};
		Arrays.sort(plist, com);
		int k = 0;
		Point2D [] qs = new Point2D[n * 2];

		for(int i = 0; i < n; i++){
			while(k > 1 && new Line2D.Double(qs[k-2] , qs[k-1]).relativeCCW(plist[i]) > 0){
				k--;
			}
			qs[k++] = plist[i];
		}
		
		for(int i = n - 2, t = k; i >= 0; i--){
			while(k > t && new Line2D.Double(qs[k-2] , qs[k-1]).relativeCCW(plist[i]) > 0){
				k--;
			}
			qs[k++] = plist[i];
		}
		Point2D [] res = Arrays.copyOf(qs, k-1);
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}