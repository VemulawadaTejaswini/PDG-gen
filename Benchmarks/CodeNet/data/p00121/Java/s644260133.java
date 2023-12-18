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
			while(sc.hasNextLine()){
				line = sc.nextLine().replaceAll(" ", "");
				solve();
			}
		}
		
		String line;
		final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
		
		void solve(){
			int x=0, y=0;
			for(int i=0; i<8; ++i){
				if(line.charAt(i)=='0'){
					x = i%4;
					y = i/4;
				}
			}
			
			LinkedList<State> open = new LinkedList<State>();
			open.add(new State(line, 0, x, y));
			
			HashMap<String, Integer> closed = new HashMap<String, Integer>();
			closed.put(line, 0);
			
			int ans=-1;
			while(!open.isEmpty()){
				State now = open.poll();
				
				if(now.s.equals("01234567")){
					ans = now.step;
					break;
				}
				
				for(int v=0; v<4; ++v){
					int xx = now.lx+vx[v], yy = now.ly+vy[v];
					if( !(0<=xx && xx<4 && 0<=yy && yy<2))	continue;
					StringBuilder tmp = new StringBuilder(now.s);
					char tmp2 = tmp.charAt(xx+yy*4);
					tmp.setCharAt(xx+yy*4, tmp.charAt(now.lx+now.ly*4));
					tmp.setCharAt(now.lx+now.ly*4, tmp2);
					
					if(!closed.containsKey(tmp.toString()) || closed.get(tmp.toString()) > now.step+1){
						open.add(new State(tmp.toString(), now.step+1, xx, yy));
						closed.put(tmp.toString(), now.step+1);
					}
					
				}
				
			}
			
			System.out.println(ans);
		}
		
		class State{
			int lx,ly,step;
			String s;
			State(String s,int step,int lx,int ly){
				this.s=s;
				this.step=step;
				this.lx=lx;
				this.ly=ly;
			}
		}
	}

}