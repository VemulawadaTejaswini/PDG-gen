import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable<State>{
		int tid, ttime, tans;
		State(int tid, int ttime,int tans){
			this.tid=tid;
			this.ttime=ttime;
			this.tans=tans;
		}
		public int compareTo(State e) {
			if(this.tans==e.tans) {
				if(this.ttime==e.ttime) {
					return this.tid-e.tid;
				}
				else {
					return this.ttime-e.ttime;
				}
			}
			else {
				return e.tans-this.tans;
			}
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int T=sc.nextInt();//チーム数
				int P=sc.nextInt();//問題数
				int R=sc.nextInt();//レコード数
				if(T==0) break;
				PriorityQueue<State> pq=new PriorityQueue<State>();
				int[] c=new int[T+1];//正解数
				int[] t=new int[T+1];//経過時間
				int[][] w=new int[T+1][P+1];//チームと問題に対するWA数
				
				for(int i=0; i<R; i++) {
					int team=sc.nextInt();
					int prob=sc.nextInt();
					int time=sc.nextInt();
					String m=sc.next();
					if(m.equals("WRONG")) {
						w[team][prob]++;
					}
					if(m.equals("CORRECT")) {
						c[team]++;
						t[team]+=time+w[team][prob]*1200;
					}
				}
				for(int i=1; i<=T; i++) {
					pq.add(new State(i, t[i], c[i]));
				}
				for(int i=1; i<=T; i++) {
					State p=pq.remove();
					System.out.println(p.tid+" "+p.tans+" "+p.ttime);
				}
				
			}


		}
	}
}
