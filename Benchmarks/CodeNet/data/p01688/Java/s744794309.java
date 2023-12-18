import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static class Problem implements Comparable<Problem> {
		int cost;
		int benefit;
		
		public Problem(int cost, int benefit) {
			super();
			this.cost = cost;
			this.benefit = benefit;
		}

		@Override
		public int compareTo(Problem arg0) {
			return -(this.benefit * arg0.cost - this.cost * arg0.benefit);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int D = sc.nextInt();
		
		PriorityQueue<Problem> queue = new PriorityQueue<Problem>();
		
		final int x = sc.nextInt();
		for(int i = 0; i < x; i++){
			final String a = sc.next();
			final int p = sc.nextInt();
			
			if(a.equals("D")){
				queue.add(new Problem(1, p));
			}
		}
		
		final int y = sc.nextInt();
		for(int i = 0; i < y; i++){
			String str = sc.next();
			final int q = sc.nextInt();
			
			int cost = 0;
			cost += str.charAt(0) == 'D' ? 1 : 0;
			cost += str.charAt(1) == 'D' ? 1 : 0;
			
			if(cost == 2){
				queue.add(new Problem(cost, q));
			}
		}
		
		int rest = D;
		int ans = 0;
		while(rest > 0 && !queue.isEmpty()){
			final Problem p = queue.poll();
			
			if(rest < p.cost){
				continue;
			}else{
				rest -= p.cost;
				ans += p.benefit;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			if (tok == null) {
				return false;
			} else {
				return tok.hasMoreTokens();
			}
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}