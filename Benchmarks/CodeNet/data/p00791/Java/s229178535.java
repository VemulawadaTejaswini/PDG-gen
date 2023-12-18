import java.awt.geom.*;
import java.util.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		new AOJ1211();
	}
	
	class AOJ1211{
		AOJ1211(){
			int cnt=0;
			while(true){
				N=sc.nextInt();
				if(N==0)	break;
				if(cnt>0)	System.out.println("----------");
				solve();
				++cnt;
			}
		}
		int N;
		final int vx[]={-1,0,1,1,1,0,-1,-1},vy[]={1,1,1,0,-1,-1,-1,0};
		final int offsetx[]={-1,-1,0,0},offsety[]={0,1,1,0};
		void solve(){
			StringBuilder[] str=new StringBuilder[N];
			sc.nextLine();
			for(int i=0; i<N; ++i)	str[i]=new StringBuilder(sc.nextLine());
			TreeMap<Integer,Integer> ans=new TreeMap<Integer,Integer>();
			ArrayList<Point2D> ps = new ArrayList<Point2D>(4);
			for(int y=0; y<N; ++y){
				for(int x=0; x<str[y].length(); ++x){
					if(str[y].charAt(x)=='*'){
						int xx=x, yy=y;
						for(int i=0; i<4; ++i){
							ps.add(new Point2D.Double(xx+offsetx[i],yy+offsety[i]));
							str[yy].setCharAt(xx, '.');
							int v=0;
							while(!(0<=yy+vy[v]&&yy+vy[v]<N&&0<=xx+vx[v]&&xx+vx[v]<str[yy+vy[v]].length()) || str[yy+vy[v]].charAt(xx+vx[v])!='*')	++v;
//							System.out.println("V"+v+" "+xx+","+yy+" "+str[yy].charAt(xx)+" "+str[yy+vy[v]].charAt(xx+vx[v]));
							while(0<=yy+vy[v]&&yy+vy[v]<N&&0<=xx+vx[v]&&xx+vx[v]<str[yy+vy[v]].length() && str[yy+vy[v]].charAt(xx+vx[v])=='*'){
								xx+=vx[v];	yy+=vy[v];
								str[yy].setCharAt(xx, '.');
							}
						}
//						System.out.println(ps);
//						System.out.println(area(ps));
						int area=(int)area(ps);
						if(ans.containsKey(area))	ans.put(area, ans.get(area)+1);
						else	ans.put(area, 1);
						ps.clear();
					}
				}
			}
			for(Map.Entry<Integer, Integer> e:ans.entrySet()){
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY() - p2.getX()*p1.getY();
		}
		double area(ArrayList<Point2D> points){
			double ret=0.0;
			for(int i=0; i<points.size(); ++i){
				Point2D p1=points.get(i), p2=points.get((i+1)%points.size());
				ret+=cross(p1, p2);
			}
			return Math.abs(ret)/2.0;
		}
	}
}