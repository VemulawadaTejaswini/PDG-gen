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
			init();
			while(sc.hasNextLine()){
				line = sc.nextLine().replaceAll(" ", "");
				solve();
			}
		}
		
		final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
		String line;
		HashMap<String,Integer> ans;
		
		void solve(){
			System.out.println(ans.get( line ));
		}
		
		void init(){
			ans = new HashMap<String,Integer>();
			ans.put("01234567", 0);
			
			LinkedList<State> open = new LinkedList<State>();
			open.add(new State("01234567", 0, 0, 0));
			
			while(!open.isEmpty()){
				State now = open.poll();
				for(int v=0; v<4; ++v){
					int xx = now.lx+vx[v], yy = now.ly+vy[v];
					if( !(0<=xx && xx<4 && 0<=yy && yy<2))	continue;
					
					StringBuilder tmp = new StringBuilder(now.state);
					char tmp2 = tmp.charAt(xx+yy*4);
					tmp.setCharAt(xx+yy*4, tmp.charAt(now.lx+now.ly*4));
					tmp.setCharAt(now.lx+now.ly*4, tmp2);
					
					if(ans.containsKey(tmp.toString()) )	continue;
					open.add(new State(tmp.toString(), now.step+1, xx, yy));
					ans.put(tmp.toString(), now.step+1);
				}
			}
		}
		class State{
			int lx,ly,step;
			String state;
			State(String state,int step,int lx,int ly){
				this.state=state;
				this.step=step;
				this.lx=lx;
				this.ly=ly;
			}
		}
	}
}