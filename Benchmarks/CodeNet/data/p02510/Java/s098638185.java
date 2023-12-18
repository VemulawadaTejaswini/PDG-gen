import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s = br.readLine();
			if ("-".equals(s)) break;
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				int h = Integer.parseInt(br.readLine());
				s = s.substring(h) + s.substring(0, h);
			}
			System.out.println(s);
		}
	}
}