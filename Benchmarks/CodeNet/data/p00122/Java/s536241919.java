import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ0122();
	}
	class AOJ0122{
		AOJ0122(){
			while(sc.hasNext()){
				int sx=sc.nextInt(),sy=sc.nextInt();
				if((sx|sy)==0)	break;
				solve(sx,sy);
			}
		}
		final int[] vx={2,2,2,1,0,-1,-2,-2,-2,-1,0,1},
					vy={-1,0,1,2,2,2,1,0,-1,-2,-2,-2};
		final int MAX=10;
		void solve(int sx,int sy){
			int n=sc.nextInt();
			Pair[] s=new Pair[n];
			for(int i=0; i<n; ++i)	s[i]=new Pair(sc.nextInt(), sc.nextInt());
			
			LinkedList<State> open=new LinkedList<State>();
			open.add(new State(sx,sy,0));
			
			boolean ans=false;
			
			while(!open.isEmpty()){
				State now=open.poll();
				if(now.z == n){
					ans=true;
					break;
				}
				for(int v=0; v<12; ++v){
					int xx=now.x+vx[v], yy=now.y+vy[v];
					if(!(0<=xx && xx<MAX && 0<=yy && yy<MAX))	continue;
					if(!(abs(s[now.z].x-xx)<=1 && abs(s[now.z].y-yy)<=1))	continue;
					open.add(new State(xx,yy,now.z+1));
				}
			}
			System.out.println(ans?"OK":"NA");
		}
		
	}
	class Pair{
		int x,y;
		Pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	class State{
		int x,y,z;
		State(int x,int y,int z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
	}

}