import java.util.*;
import java.awt.geom.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		new AOJ1298();
//		System.out.println(Line2D.relativeCCW(0, 0, 0, 2, 0.00000001, 1));
	}
	
	
	class AOJ1298{
		int N,M;
		AOJ1298(){
//			System.out.println(CCW(new Point2D.Double(0,0), new Point2D.Double(0, 2), new Point2D.Double(-1, 0) ));
			while(true){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				System.out.println( solve()? "YES": "NO");
			}
		}
		boolean solve(){
			Point2D[] b=new Point2D[N],
					w=new Point2D[M];
			for(int i=0; i<N; ++i)	b[i]=new Point2D.Double(sc.nextInt(), sc.nextInt());
			for(int i=0; i<M; ++i)	w[i]=new Point2D.Double(sc.nextInt(), sc.nextInt());
			
			if(N==1 && M==1){
				return true;
			}
			
			if(N>=3)	b = convexHull(b);
			if(M>=3)	w = convexHull(w);
			
			N=b.length;	M=w.length;
			
//			return f(b,w)&&f(w,b);
			if(N>M)	return f(b,w);
			else	return f(w,b);
		}
		
		boolean f(Point2D[] n,Point2D[] m){
			N=n.length;	M=m.length;
			
//			System.out.println(Arrays.toString(n));
//			System.out.println(Arrays.toString(m));
			
			if(M==1&&N==2){
				Line2D l = new Line2D.Double(n[0], n[1]);
				if(CCW(l, m[0]) == 0 && l.ptLineDist(m[0]) < EPS)	return false;
				else												return true;
			}else if(N==2 && M==2){
				Line2D l1 = new Line2D.Double(n[0],n[1]),
						l2 = new Line2D.Double(m[0],m[1]);
				if(l1.intersectsLine(l2)){
					return false;
				}else{
					if( segSegDist(l1, l2) < EPS)	return false;
					else							return true;
				}
			}else{
				// N>=3 
				for(int i=0; i<M; ++i){
					boolean b = false;
					for(int j=0; j<N; ++j){
//						System.out.println(CCW(n[j], n[(j+1)%N], m[i]));
//						System.out.println(n[j]+" "+n[(j+1)%N]+" "+m[i]);
						if(CCW(n[j], n[(j+1)%N], m[i]) > 0){
							b = true;
							break;
						}
					}
//					System.out.println(m[i]+" "+b);
					if(!b)	return false;
				}
				if(M>=3){
					for(int i=0; i<N; ++i){
						boolean b = false;
						for(int j=0; j<M; ++j){
//							System.out.println(CCW(m[j], m[(j+1)%M], n[i]));
//							System.out.println(m[j]+" "+m[(j+1)%M]+" "+n[i]);
							if(CCW(m[j], m[(j+1)%M], n[i]) > 0){
								b = true;
								break;
							}
						}
//						System.out.println(n[i]+" "+b);
						if(!b)	return false;
					}
				}
				return true;
			}
		}
		
		final double EPS=1.0e-8;
		double segSegDist(Line2D l1,Line2D l2){
			return l1.intersectsLine(l2)? 0 :Math.min(Math.min(l1.ptSegDist(l2.getP1()), l1.ptSegDist(l2.getP2())) , Math.min(l2.ptSegDist(l1.getP1()), l2.ptSegDist(l1.getP2())));
		}
		int CCW(Line2D l, Point2D p3){
			return CCW(l.getP1(), l.getP2(), p3);
		}
		private int CCW(Point2D p1, Point2D p2, Point2D p3){
			Point2D p3p1 = sub(p3, p1);
			Point2D p3p2 = sub(p3, p2);
			double res = cross(p3p1, p3p2);
			if(Math.abs(res) < EPS) return 0;
			else if(res < EPS) return 1;
			else return -1;
		}
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY() - p2.getX()*p1.getY();
		}
		double dot(Point2D p1,Point2D p2){
			return p1.getX()*p2.getX() + p1.getY()*p2.getY();
		}
		Point2D sum(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		}
		Point2D add(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		}
		Point2D diff(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(), p1.getY()-p2.getY());
		}
		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(), p1.getY()-p2.getY());
		}
		Point2D mid(Line2D l1){
			return mid(l1.getP1(),l1.getP2());
		}
		Point2D mid(Point2D p1,Point2D p2){
			return new Point2D.Double((p1.getX()+p2.getX())/2, (p1.getY()+p2.getY())/2);
		}
		Point2D mul(double n,Point2D p1){
			return new Point2D.Double(p1.getX()*n, p1.getY()*n);
		}
		Comparator< Point2D > com = new Comparator< Point2D >() {
			public int compare(Point2D o1, Point2D o2) {
				if(o1.getX() < o2.getX()) return -1;
				else if(o1.getX() > o2.getX()) return 1;
				else if(o1.getY() < o2.getY()) return -1;
				else if(o1.getY() > o2.getY()) return 1;
				else return 0;
			}
		};
		private Point2D [] convexHull(Point2D [] plist) {
			int n = plist.length;
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
	}
}