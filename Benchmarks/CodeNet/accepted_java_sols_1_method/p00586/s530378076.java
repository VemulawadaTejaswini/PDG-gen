import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				System.out.println(A+B);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}