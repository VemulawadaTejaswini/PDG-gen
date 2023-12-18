import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new GCL_4A().doIt();
	}

	class GCL_4A{

		//凸包
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

		void doIt(){
			int n = in.nextInt();
			Point2D[] plist = new Point2D[n];
			for(int i=0;i<n;i++)plist[i] = new Point2D.Double(in.nextDouble(), in.nextDouble());
			Point2D[] result = convexHull(plist);
			LinkedList<Point2D> list = new LinkedList<Point2D>();
			for(int i=0;i<result.length;i++){
				list.add(result[i]);
				Line2D l = new Line2D.Double(result[i],result[(i+1)%result.length]);
//				System.out.println(l.getP1()+" "+l.getP2());
				for(int s=0;s<plist.length;s++)if(!plist[s].equals(result[i])&&!plist[s].equals(result[(i+1)%result.length])){
					if(l.ptSegDist(plist[s])==0){
						list.add(plist[s]);
					}
				}
			}
			System.out.println(list.size());
			for(int i=0;i<list.size();i++)System.out.println((int)list.get(i).getX()+" "+(int)list.get(i).getY());
		}
	}

}