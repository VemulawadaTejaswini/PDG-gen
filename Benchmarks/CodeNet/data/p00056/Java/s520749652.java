import java.io.*;

class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while ((buf = br.readLine()).equals("0")==false) {
				int n = Integer.parseInt(buf);

				int list[] = new int[n+1];
				int c = 0;
				for (int i=2;i<=n;i++) list[i] = 0;
				for (int i=2;i<=n;i++) {
					for (int j=2;i*j<=n;j++) {
						list[i*j] = 1;
					}
				}
				for (int i=2;i<=n;i++) {
					if (list[i]==0) c++;
				}
				int p[] = new int[c+2];
				int ptr = 0;
				for (int i=2;i<=n;i++) {
					if (list[i]==0) p[ptr++] = i;
				}

				int count = 0;
				for (int i=0;i<ptr;i++) {
					if (p[i]>n) break;
					for (int j=i;j<ptr;j++) {
						if (p[i]+p[j]==n) count++;
						else if (p[j]>n) break;
					}
				}
				System.out.println(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}