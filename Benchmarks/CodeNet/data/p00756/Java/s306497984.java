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
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		Circle[] c;
		boolean[][] b;
		HashSet<Integer> vtd;
		int N;
		void solve(){
			c=new Circle[N];
			for(int i=0; i<N; ++i)	c[i]=new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()-1);
			b=new boolean[N][N];
			for(int i=0; i<N; ++i)for(int j=0; j<i; ++j)	b[i][j]=(c[i].r+c[j].r <= c[i].p.distance(c[j].p));
			vtd = new HashSet<Integer>();
			int ret=dfs((1<<N)-1);
			System.out.println(N-ret);
		}
		int dfs(int cc){
//			System.out.println(Integer.toBinaryString(cc));
			int ret=Integer.bitCount(cc);
			if(vtd.contains(cc))	return ret;
			vtd.add(cc);
			
			int cand=0;
			for(int i=0; i<N; ++i)if((cc&(1<<i))>0){
				boolean flg=true;
				for(int j=0; j<i; ++j)if((cc&(1<<j))>0 && !b[i][j]){
					flg=false;
					break;
				}
				if(flg)	cand |= (1<<i);
			}
//			System.out.println(Integer.toBinaryString(cand));
			for(int i=0; i<N; ++i)if((cand&(1<<i))>0){
				for(int j=0; j<N; ++j)if(i!=j && (cand&(1<<j))>0 && c[i].c==c[j].c){
					int tmp=(1<<i)|(1<<j);
					cc ^= tmp;
					ret = min(ret, dfs(cc));
					cc |= tmp;
				}
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
		}
	}
}