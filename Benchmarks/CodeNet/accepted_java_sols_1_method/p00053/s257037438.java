import java.io.*;

class Main {
	private static final int M = 104730;

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

		try {
			while ((buf = br.readLine()).equals("0")==false) {
				int n = Integer.parseInt(buf);
				int count = 0;
				long sum = 0;
				for (int i=2;i<=M;i++) {
					if (list[i]==0) {
						sum += (long)i;
						count++;
						if (count==n) break;
					}
				}
				System.out.println(sum);
			}
		} catch (Exception e) {
			//Exception
		}
	}
}