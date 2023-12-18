import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ0121();
	}
	
	class AOJ0121{
		AOJ0121(){
			while(sc.hasNext()){
				line = sc.nextLine().replaceAll(" ", "");
				solve();
			}
		}
		
		String line;
		final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
		final int INF = 1<<29, MAX = 1<<(3*8), fin = Integer.parseInt("01234567", 8);
		int init,x,y;
		
		void solve(){
			int x=0, y=0;
			for(int i=0; i<8; ++i){
				if(line.charAt(i)=='0'){
					x = i%4;
					y = i/4;
				}
			}
			
			init = Integer.parseInt(line, 8);
			LinkedList<State> open = new LinkedList<State>();
			open.add(new State(init, 0, x, y));
			
			int MAX = 1<<(3*8);
			boolean[] closed = new boolean[MAX+1];
			closed[init] = true;
			
			int ans=-1;
			while(!open.isEmpty()){
				State now = open.poll();
				
				if(now.state == fin){
					ans = now.step;
					break;
				}
				
				for(int v=0; v<4; ++v){
					int xx = now.lx+vx[v], yy = now.ly+vy[v];
					if( !(0<=xx && xx<4 && 0<=yy && yy<2))	continue;
					
					StringBuilder tmp = new StringBuilder(Integer.toOctalString(now.state));
					if(tmp.length() < 8)tmp.insert(0, '0');
					char tmp2 = tmp.charAt(xx+yy*4);
					tmp.setCharAt(xx+yy*4, tmp.charAt(now.lx+now.ly*4));
					tmp.setCharAt(now.lx+now.ly*4, tmp2);
					
					int next = Integer.parseInt(tmp.toString(), 8);
					
					if(closed[next])	continue;
					open.add(new State(next, now.step+1, xx, yy));
					closed[next] = true;
				}
			}
			System.out.println(ans);
		}
		
		class State{
			int lx,ly,step,state;
			State(int state,int step,int lx,int ly){
				this.state=state;
				this.step=step;
				this.lx=lx;
				this.ly=ly;
			}
		}
	}
}