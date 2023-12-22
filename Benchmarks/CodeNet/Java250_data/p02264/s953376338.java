import java.util.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Queue<Process> que = new ArrayDeque<Process>();
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		for(int i = 0; i < n; ++i){
			String nm = sc.next();
			int t = Integer.parseInt(sc.next());
			que.add(new Process(nm, t));
		}
		sc.close();
		int t = 0;
		while(!que.isEmpty()){
			Process cur = que.poll();
			int prctime = Math.min(q, cur.getTime());
			cur.setTime(cur.getTime() - prctime);
			t += prctime;
			if(cur.getTime() > 0)
				que.add(cur);
			else System.out.printf("%s %d\n", cur.getName(), t);
		}
	}
	
	
	
	static class Process{
		String name; int time;
		public Process(String s, int t){
			name = s; time = t;
		}
		public void setName(String nm){
			name = nm;
		}
		public String getName(){
			return name;
		}
		public void setTime(int t){
			time = t;
		}
		public int getTime(){
			return time;
		}
	}

}
