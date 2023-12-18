import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] in = br.readLine().split(" ");
			int n = Integer.parseInt(in[0]), x = Integer.parseInt(in[1]);
			if (n == 0 && x == 0) break;
			System.out.println(solve(n, x));
		}
	}
	
	public static int solve(int n, int x) {
		int c = 0;
		for (int i=1; i < n+1; i++) for (int j = i+1; j < n+1; j++) for (int k = j+1; k < n+1; k++) if (i+j+k == x) c++;
		return c;
	}
}