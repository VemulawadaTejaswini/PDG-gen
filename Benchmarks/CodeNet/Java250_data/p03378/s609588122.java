import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main {
	
	static int n,m,x;
	static int[] a = new int[101];
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		
		String s = in.readLine();
		String[] as = s.split(" ");
		n = Integer.parseInt(as[0]);
		m = Integer.parseInt(as[1]);
		x = Integer.parseInt(as[2]);
		
		s = in.readLine();
		String[] as2 = s.split(" ");
		
		for (int i=0; i < m; i++) {
			a[Integer.parseInt(as2[i])] = 1;
		}
		System.out.println(solve());
	}

	private static int solve() {
		int ans0 = 0;
		int ansN = 0;
		for(int i = x; i < n; i++) {
			
			ans0 += a[i];
		}
		if(ans0==0) return 0;
		for(int i = x; i > 0; i--) {
			ansN += a[i];
		}
		if(ans0>ansN) {
			return ansN;
		} else {
			return ans0;
		}
		
	}

	
	
}