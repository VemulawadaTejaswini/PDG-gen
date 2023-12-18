import java.util.*;
public class Main {
	//0250 start
	//0315 acording end
	//0342 samplematched 
	int INF = 1 << 24;
	
	class State {
		int step, time, pos, bal;
		int dis;
		public State(int step, int time,int pos, int dis, int bal) {
			this.step = step;
			this.time = time;
			this.pos = pos;
			this.dis = dis;
			this.bal = bal;
		}
		@Override
		public String toString() {
			return "State [step=" + step + ", time=" + time + ", pos=" + pos
					+ ", bal=" + bal + ", dis=" + dis + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if (n == 0 ) break;
			int [] pos = new int[n+1];
			int [] time = new int[n+1];
			int maxtime = 0;
			for(int i = 1; i < n+1; i++){
				pos[i] = sc.nextInt();
				time[i] = sc.nextInt();
				maxtime = Math.max(maxtime, time[i]);
			}
			if(pos[1] > time[1]){
				System.out.println("NG 1");
				continue;
			}
			
			LinkedList<State> open = new LinkedList<Main.State>();
			open.add(new State(1, time[1], pos[1], pos[1], 1));
			double [][] close = new double[n+1][n+1];
//			double [][][] close = new double[n+1][n+1][maxtime + 1];
			for(int i = 0 ; i < n + 1; i++){
				Arrays.fill(close[i], INF);
			}
			
			int ansstep = 0;
			int ansdis = INF;
			while(! open.isEmpty()){
				State now = open.poll();
				//System.out.println(now);
				ansstep = Math.max(ansstep, now.step);
				if(n == now.step){
					//かえる
					ansdis = Math.min(ansdis, now.dis + now.pos);
					continue;
				}
				//ハウスに戻る
				int nextstep = now.step + 1;
				int nextpos =  pos[nextstep];
				int nextdis = now.pos + now.dis + nextpos;
				int nexttime = now.time + now.pos * (now.bal + 1) + nextpos;
				
				if(nexttime <= time[nextstep]){
					if(close[nextstep][0] > nextdis){
						open.add(new State(nextstep, time[nextstep], nextpos, nextdis, 1));
						close[nextstep][0] = nextdis;
					}
				}
				
				//そのまま
				if(now.bal == 3) continue;
				nextdis = now.dis + Math.abs(now.pos - nextpos);
				nexttime = now.time + Math.abs(now.pos - nextpos) * (now.bal + 1);
				if(nexttime <= time[nextstep]){
					if(close[nextstep][now.bal + 1] > nextdis){
						open.add(new State(nextstep, time[nextstep], nextpos, nextdis, now.bal + 1));
						close[nextstep][now.bal + 1 ] = nextdis;
					}
				}
			}
			if(ansdis == INF){
				System.out.println("NG " + (ansstep + 1));
			}
			else{
				System.out.println("OK " + ansdis);
			}
		}
	}
	
	
	public static void main(String [] args){
		new Main().doit();
	}
}