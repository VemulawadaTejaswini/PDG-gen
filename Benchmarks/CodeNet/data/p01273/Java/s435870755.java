import java.util.*;

public class Main{
	class C implements Comparable<C>{
		int t,from, to;

		public C(int t, int from, int to) {
			this.t = t;
			this.from = from;
			this.to = to;
		}

		@Override
		public int compareTo(C o) {
			return this.t - o.t;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			C [] data = new C[m];
			for(int i = 0; i < m; i++){
				data[i] = new C(sc.nextInt(), sc.nextInt() - 1, sc.nextInt() - 1);
			}
			Arrays.sort(data);
			boolean [] isV = new boolean[n];
			isV[0] = true;
			for(int i = 0; i < m; i++){
				isV[data[i].to] = isV[data[i].to] | isV[data[i].from];
			}
			int count = 0;
			for(int i = 0; i < n; i++){
				if(isV[i]) count++;
			}
			
			System.out.println(count);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}