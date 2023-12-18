
import java.awt.geom.*;
import java.awt.geom.Point2D.Double;
import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new C();
	}
	
	class B{
		B(){
			while(sc.hasNext()){
				int n = sc.nextInt();
				Point2D [] plist = new Point2D[n];
				for(int i = 0 ; i < n; i++){
					plist[i] = new Point2D.Double(sc.nextInt(), sc.nextInt());
				}
				ArrayList<Line2D> llist = new ArrayList<Line2D>();
				for(int i = 0 ; i < n; i++){
					for(int j = i + 2; j < n; j++){
						if(i== 0 && j == n-1){
							continue;
						}
						llist.add(new Line2D.Double(plist[i], plist[j]));
					}
				}
				
				boolean flg = true;
				Point2D ans = null;
				for(int i = 0 ; i < llist.size(); i++){
					for(int j = i + 1; j < llist.size(); j++){
						Point2D now = intersect(llist.get(i), llist.get(j));
						if(ans == null){
							ans = now;
							continue;
						}
						if(issame(ans, now)){
							
						}
						else{
							flg = false;
							break;
						}
					}
					if(! flg ){
						break;
					}
				}
				//debug
//				for(int i = 0 ; i < llist.size(); i++){
//					System.out.println(llist.get(i).getP1() + " " + llist.get(i).getP2() );
//				}
				if(ans != null && flg){
					//System.out.println(ans);
					System.out.printf("%f %f\n", ans.getX() , ans.getY());
				}
				else{
					System.out.println("NA");
				}
			}
			
		}
		double EPS = 1.0e-08;

		private boolean issame(Point2D p1, Point2D p2) {
			if(Math.abs(p1.getX() - p2.getX()) < EPS && Math.abs(p1.getY() - p2.getY()) < EPS){
				return true;
			}
			return false;
		}

		private Point2D intersect(Line2D l, Line2D m) {
			Point2D lv = sub(l.getP2(), l.getP1());
			Point2D mv = sub(m.getP2(), m.getP1());
			Point2D mlv = sub(m.getP1(), l.getP1());
			double a = cross(mlv, lv);
			double b = cross(lv, mv);
			if(Math.abs(a) < EPS && Math.abs(b) < EPS){
				return l.getP1();
			}
			double t = a / b;
			double resx = m.getX1() + t * mv.getX();
			double resy = m.getY1() + t * mv.getY();
			
			return new Point2D.Double(resx, resy);
		}

		private double cross(Point2D p1, Point2D p2) {
			double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
			return res;
		}

		private Point2D sub(Point2D p2, Point2D p1) {
			double x = p2.getX() - p1.getX();
			double y = p2.getY() - p1.getY();
			
			return new Point2D.Double(x,y);
		}
	}
	
	class C{
		C(){
			int M=sc.nextInt();
			HashMap<String, Num> map=new HashMap<String, Num>();
			for(int i=0; i<M; i++){
				String str=sc.next();
				int a=sc.nextInt(),b=sc.nextInt();
				map.put(str, new Num(a, b, (a==0||b==0)));
			}
			int N=sc.nextInt();
			String[] e=new String[N];
			for(int i=0; i<N; i++)	e[i]=sc.next();
			
			// TODO debug
			//System.out.println(Arrays.toString(e));
			
			boolean er=false;
			LinkedList<Num> s=new LinkedList<Num>();
			for(int i=0; i<N; i++){
				// TODO debug
				//System.out.println(s);
				
				if(map.containsKey(e[i])){
					s.push(map.get(e[i]));
				}else{
					try{
						int tmp=Integer.parseInt(e[i]);
						s.push(new Num(tmp,tmp,tmp==0));
					}catch(Exception ex){
						Num b=s.pop(),a=s.pop();
						if(e[i].equals("+")){
							boolean z=(a.hi+b.hi)>255;
							s.push(new Num(min(255,(a.lo+b.lo)), min(255,(a.hi+b.hi)), z));
						}else if(e[i].equals("-")){
							boolean z=(a.lo-b.hi)<=0;
							s.push(new Num(max(0, (a.lo-b.hi)), max(0, (a.hi-b.lo)), z));
						}else if(e[i].equals("*")){
							boolean z=a.zero||b.zero;
							int max=0;
							for(int aa=a.lo; aa<=a.hi; aa++){
								for(int bb=b.lo; bb<=b.hi; bb++){
									if(aa*bb>=256){
										z|=(aa*bb==256);
										break;
									}
									max=max(max,aa*bb);
								}
								if(max==255 && z)	break;
							}
							s.push(new Num(min(max, a.lo*b.lo), max, z));
						}
						else if(e[i].equals("/")){
							if(b.zero){
								// TODO debug
								//System.out.println("ER"+i);
								er=true;
								break;
							}
							int max=0,min=255;
							boolean z=a.zero;
							for(int aa=a.lo; aa<=a.hi; aa++){
								for(int bb=b.lo; bb<=b.hi; bb++){
									max=max(max, aa/bb);
									min=min(min, aa/bb);
									z|=(aa/bb==0);
									if(aa/bb<=0)	break;
								}
							}
							s.push(new Num(min, max, z));
						}
					}
				}
			}
			System.out.println(er?"error":"correct");
		}
		class Num{
			int lo,hi;
			boolean c,zero;
			Num(int lo,int hi,boolean zero){
				this.lo=lo;
				this.hi=hi;
				this.zero=zero || lo==0 || hi==0;
			}
			@Override public String toString(){
				return "(LO"+lo+" HI"+hi+" z-"+zero+")";
			}
		}
	}
	
	
}