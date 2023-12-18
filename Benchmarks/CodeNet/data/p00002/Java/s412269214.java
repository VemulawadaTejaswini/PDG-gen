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
			String s = Integer.toString(a+b);
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}