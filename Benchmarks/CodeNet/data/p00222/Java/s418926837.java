import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			int n = 10000000;
			boolean list[] = new boolean[n+1];
			for (int i=2;i<=n;i++) list[i] = true;
			for (int i=2;i<=n;i++) {
				for (int j=2;i*j<=n;j++) {
					list[i*j] = false;
				}
			}

			while (!(buf = br.readLine()).equals("0")) {
				int N = Integer.parseInt(buf);
				if (N%2==0) N--;
				for (int i=N;i>=13;i-=2) {
					if (list[i]&&list[i-2]&&list[i-6]&&list[i-8]) {
						System.out.println(i);
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}