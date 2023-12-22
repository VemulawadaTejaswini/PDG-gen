import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;


		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				int p_m = 0;
				int sum = 0;
				for (int i=0;i<n;i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					int p = Integer.parseInt(st.nextToken());
					int dd = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
					if (sum<dd) {
						p_m = p;
						sum = dd;
					}
				}
				System.out.println(p_m+" "+sum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}