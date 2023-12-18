import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ("0 0".equals(buf = br.readLine())==false) {
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
				System.out.println(solve(n,s,0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int solve(int n,int s,int r) {
		if (n==0) {
			if (s==0) return 1;
			else return 0;
		}
		else {
			int count = 0;
			for (int i=r;i<=9;i++) {
				count += solve(n-1,s-i,i+1);
			}
			return count;
		}
	}
}