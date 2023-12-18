import java.io.*;
import java.util.Arrays;

class Main {
	private static final int M = 50000;

	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		int list[] = new int[M+1];
		for (int i=2;i<=M;i++) list[i] = 0;
		for (int i=2;i<=M;i++) {
			for (int j=2;i*j<=M;j++) {
				list[i*j] = 1;
			}
		}
		int count[] = new int[M+1];
		Arrays.fill(count,0);
		for (int i=2;i<M/2;i++) {
			if (list[i]==0) {
				for (int j=i;j<M;j++) {
					if (i+j>M) break;
					if (list[j]==0) count[i+j]++;
				}
			}
		}


		try {
			while ((buf = br.readLine()).equals("0")==false) {
				int n = Integer.parseInt(buf);
				System.out.println(count[n]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}