import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String buf = br.readLine();
			StringTokenizer st = new StringTokenizer(buf);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int count = 0;
			for (int i=a;i<=b;i++) {
				if (c%i==0) count++;
			}
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}