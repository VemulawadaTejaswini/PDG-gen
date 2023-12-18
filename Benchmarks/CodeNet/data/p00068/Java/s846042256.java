import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0068().doIt();
	}
	
	
	class AOJ0068{
		int n;
		Point2D p[];
		
		void solve(){
			Point2D[] a = convexHull(p);
//			System.out.println(Arrays.toString(a));
			System.out.println(p.length-a.length);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				p = new Point2D[n];
				for(int i=0;i<n;i++){
					String[] a = in.next().split(",");
					p[i] = new Point2D.Double(Double.parseDouble(a[0]),Double.parseDouble(a[1]));
				}
//				System.out.println(Arrays.toString(p));
				solve();
			}
		}
		//凸包 返上は含めない
		Comparator< Point2D > com = new Comparator< Point2D >() {
			public int compare(Point2D p1,Point2D p2) {
				if(p1.getX() < p2.getX()) return -1;
				else if(p1.getX() > p2.getX()) return 1; 
				else if(p1.getY() < p2.getY()) return -1;
				else if(p1.getY() > p2.getY()) return 1; 
				else return 0;
			}
		};
		Point2D[] convexHull(Point2D []plist) { 
			int n = plist.length; Arrays.sort(plist, com);
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
	}
	
}