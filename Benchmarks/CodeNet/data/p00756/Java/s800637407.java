import java.awt.geom.Point2D;
import java.util.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1175();
	}
	final int INF=1<<28;
	
	class AOJ1175{
		AOJ1175(){
			ccc = new Circle[25][2];
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		Circle[] c;
		Circle[][] ccc;
		int N;
		void solve(){
			c=new Circle[N];
			for(int i=0; i<N; ++i)	c[i]=new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()-1);
			
			System.out.println(dfs(c, 0));
		}
		int dfs(Circle[] c,int depth){
//			System.out.println(depth+" "+Arrays.toString(c));
			int ret=0;
			for(int i=0; i<N; ++i)if(c[i]==null)	++ret;
			ArrayList<ArrayList<Integer>> list=list(c);
//			System.out.println(depth+" "+list);
			for(int i=0; i<4; ++i){
				if(list.get(i).size() >= 2){
					int n=list.get(i).size(), b=(1<<n)-1;
					for(int j=3; j<=b; ++j)if(Integer.bitCount(j)==2){
						for(int k=0,l=0; k<n; ++k)if((j&(1<<k))>0){
							ccc[depth][l++]=c[list.get(i).get(k)];
							c[list.get(i).get(k)]=null;
						}
						ret = max(ret, dfs(c, depth+1));
						for(int k=0,l=0; k<n; ++k)if((j&(1<<k))>0)	c[list.get(i).get(k)]=ccc[depth][l++];
					}
				}
			}
			return ret;
		}
		ArrayList<ArrayList<Integer>> list(Circle[] c){
			ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>(4);
			for(int i=0; i<4; ++i)	ret.add(new ArrayList<Integer>());
			for(int i=0; i<N; ++i)if(c[i]!=null){
				boolean flg=true;
				for(int j=0; j<i; ++j)if(c[j]!=null){
					flg = (c[i].r+c[j].r) <= (c[i].p.distance(c[j].p));
					if(!flg)	break;
				}
				if(flg)	ret.get(c[i].c).add(i);
			}
			return ret;
		}
		class Circle{
			Point2D p;
			double r;
			int c;
			Circle(double x,double y,double r,int c){
				this.p=new Point2D.Double(x,y);
				this.r=r;
				this.c=c;
			}
			@Override
			public String toString() {
				return p.getX()+","+p.getY()+","+r+" "+c;
			}
		}
	}
}