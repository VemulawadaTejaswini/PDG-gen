import java.io.*;

class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int n = Integer.parseInt(buf);
				int list[] = new int[n+1];
				for (int i=2;i<=n;i++) list[i] = 0;
				for (int i=2;i<=n;i++) {
					for (int j=2;j<Math.sqrt(n)&&i*j<=n;j++) {
						list[i*j] = 1;
					}
				}
				int count = 0;
				for (int i=2;i<=n;i++) {
					if (list[i]==0) count++;
				}
				System.out.println(count);
			}
		} catch (Exception e) {
			//Exception
		}
	}
}