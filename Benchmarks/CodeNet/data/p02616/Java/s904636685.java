import java.io.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static final int MOD = (int) 1e9 + 7;

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt(), k = sc.nextInt();
		ArrayList<Long> pos = new ArrayList<>();
		ArrayList<Long> neg = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			long x = sc.nextInt();
			if(x < 0) neg.add(-x);
			else pos.add(x);
		}
		
		int rem = k - pos.size();
		if((rem > 0 && rem % 2 != 0 && neg.size() <= rem) || (pos.size() == 0 && k % 2 == 1)) { //minimize
			Collections.sort(pos);
			Collections.sort(neg);
			
			long ans = 1;
			for(int i = 0, j = 0; k > 0; k--) {
				long po = i < pos.size() ? pos.get(i) : Integer.MAX_VALUE;
				long ne = j < neg.size() ? neg.get(j) : Integer.MAX_VALUE;
				
				if(po <= ne) {
					i++;
					ans *= po;
					ans %= MOD;
				}else {
					j++;
					ans *= ne;
					ans %= MOD;
				}
			}
			
			ans = (-ans + MOD) % MOD;
			out.println(ans);
			
		}else {
			
			Collections.sort(pos, Collections.reverseOrder());
			Collections.sort(neg, Collections.reverseOrder());
			
			int i = Math.min(k - 1, pos.size() - 1);
			if((k - i - 1) % 2 != 0) i--;
			int j = k - i - 2;
			
			while(i > 0 && j < neg.size() - 2) {
				long ne = neg.get(j + 1) * neg.get(j + 2);
				long po = pos.get(i) * pos.get(i - 1);
				
				if(ne > po) {
					j += 2;
					i -= 2;
				}else {
					break;
				}
			}
			
			long ans = 1;
			for(int idx = 0; idx <= i; idx++) {
				ans *= pos.get(idx);
				ans %= MOD;
			}
			
			for(int idx = 0; idx <= j; idx++) {
				ans *= neg.get(idx);
				ans %= MOD;
			}
			
			out.println((ans + MOD) % MOD);
		}
		
		out.close();
	}

}

class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}

	public Scanner(String file) throws Exception {
		br = new BufferedReader(new FileReader(file));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}