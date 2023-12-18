import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] in = br.readLine().split(" ");
			int m = Integer.parseInt(in[0]), f = Integer.parseInt(in[1]), r = Integer.parseInt(in[2]);
			if (m == -1 && f == -1 && r == -1) break;
			System.out.println(solve(m, f, r));
		}
	}
	
	public static char solve(int m, int f, int r) {
		if (m == 0 || f == 0) return 'F';
		if (80 <= m+f) return 'A';
		if (65 <= m+f) return 'B';
		if (50 <= m+f) return 'C';
		if (30 <= m+f) return (50 <= r) ? 'C' : 'D';
		return 'F';
	}
}