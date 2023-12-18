import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ0210();
	}
	
	class AOJ0210{
		AOJ0210(){
			while(sc.hasNext()){
				int w=sc.nextInt(),h=sc.nextInt();
				if((w|h)==0)	break;
				solve(w,h);
			}
		}
		ArrayList<P> q=new ArrayList<P>();
		final int[] vx={1,0,-1,0},vy={0,-1,0,1},vvv={3,0,1,2};
		void solve(int w,int h){
			int[][] map=new int[w][h];
			ArrayList<P> start=new ArrayList<P>();
			for(int y=0; y<h; ++y){
				char[] line=sc.next().toCharArray();
				for(int x=0; x<w; ++x){
					map[x][y]=(line[x]=='#'? -1: line[x]=='X'? 1: 0);
					switch(line[x]){
					case 'E':	start.add(new P(x,y,0,start.size()));	break;
					case 'S':	start.add(new P(x,y,3,start.size()));	break;
					case 'W':	start.add(new P(x,y,2,start.size()));	break;
					case 'N':	start.add(new P(x,y,1,start.size()));	break;
					}
				}
			}
			
//			System.out.println("S:"+start);
			
			int ans=-1;
			for(int i=0; i<300; ++i){
				int cnt=0;
				for(int j=0; j<start.size(); ++j){
					P now=start.get(j);
					if(now.idx<0)	continue;
					for(int v=0; v<4; ++v){
						int vv=(now.v+vvv[v])%4;
						int xx=now.x+vx[vv],yy=now.y+vy[vv];
						if(!(0<=xx && xx<w && 0<=yy && yy<h))	continue;
						if(map[xx][yy]<0)	continue;
						boolean f=false;
						for(P tmp:start)	f=f|(tmp.x==xx&&tmp.y==yy);
						if(f)	continue;
						add(new P(xx,yy,vv,now.idx));
//						System.out.println("0: "+xx+","+yy+" "+vv);
						break;
					}
					++cnt;
				}
				
//				System.out.println("Q"+q);
				
				if(cnt<=0){
					ans=i;
					break;
				}
				
				for(P tmp:q){
					start.get(tmp.idx).v=tmp.v;
					start.get(tmp.idx).x=(map[tmp.x][tmp.y]>0? -1: tmp.x);
					start.get(tmp.idx).y=(map[tmp.x][tmp.y]>0? -1: tmp.y);
					start.get(tmp.idx).idx=(map[tmp.x][tmp.y]>0? -1: tmp.idx);
				}
				
				q.clear();
//				
//				System.out.println(start);
				
			}
			
			
			System.out.println(ans<0? "NA": ans);
			
		}
		void add(P a){
			int cnt=0;
			for(int i=0; i<q.size(); ++i){
				P tmp=q.get(i);
				if(a.x==tmp.x && a.y==tmp.y){
					++cnt;
					if((a.v+2)%4<(tmp.v+2)%4){
						q.remove(i);
						q.add(a);
					}
				}
			}
			if(cnt<=0)	q.add(a);
		}
		class P{
			int x,y,v,idx;
			P(int x,int y,int v,int idx){
				this.x=x;
				this.y=y;
				this.v=v;
				this.idx=idx;
			}
			@Override public String toString(){
				return x+","+y+" "+v+" "+idx;
			}
		}
	}
	
}