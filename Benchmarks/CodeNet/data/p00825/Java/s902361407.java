
import java.io.*;
import java.util.*;



public class Main {
	int N;
	class State{
		int a;
		int b;
		int c;
		public State(int a, int b, int c){
			this.c = c;
			this.a = a;
			this.b = b;
		}
		private Main getOuterType() {
			return Main.this;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + a;
			result = prime * result + b;
			result = prime * result + c;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if(this == obj) return true;
			if(obj == null) return false;
			if(getClass() != obj.getClass()) return false;
			State other = (State)obj;
			if(!getOuterType().equals(other.getOuterType())) return false;
			if(a != other.a) return false;
			if(b != other.b) return false;
			if(c != other.c) return false;
			return true;
		}
	}
	
	HashMap<State, Integer> dp = new HashMap<>();
	HashMap<Integer, ArrayList<State>> input = new HashMap<>();
	public int dfs(int idx, int n1, int n2){
		if(idx >= 366) return 0;
		if(n1 < idx) n1 = 0;
		if(n2 < idx) n2 = 0;
		State t = new State(idx, n1, n2);
		if(dp.containsKey(t)) return dp.get(t);
		int ans = dfs(idx + 1, n1, n2);
		ArrayList<State> data = input.get(idx);
		if(data != null){
			if(n1 < idx && n2 < idx){
				for(int i = 0; i < data.size(); i++){
					for(int j = i + 1; j < data.size(); j++){
						int n3 = data.get(i).b;
						int n4 = data.get(j).b;
						ans = Math.max(ans, dfs(idx + 1, Math.max(n3, n4), Math.min(n3, n4)) + data.get(i).c + data.get(j).c);
					}
				}
			}
			if(n2 < idx){
				for(State p : data){
					int n3 = p.b;
					ans = Math.max(ans, dfs(idx + 1, Math.max(n1, n3), Math.min(n1, n3)) + p.c);	
				}
			}
		}
		//printf("(%d %d %d) = %d\n", idx, n1, n2, ans);

		dp.put(t,  ans);
		return ans;
		
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		while(true){
			N = sc.nextInt();
			if(N == 0) break;
			input.clear();
			dp.clear();
			for(int i = 0; i < N; i++){
				State s = new State(sc.nextInt(), sc.nextInt(), sc.nextInt());
				if(!input.containsKey(s.a)){
					input.put(s.a, new ArrayList<>());
				}
				input.get(s.a).add(s);
					
			}
			
			System.out.println(dfs(1, 0, 0));
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}