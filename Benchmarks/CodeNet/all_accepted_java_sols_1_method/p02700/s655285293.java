import java.io.*;

public class Main {
	static Reader in = new InputStreamReader(System.in);
	static Writer out = new PrintWriter(System.out);

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(in)) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int d = Integer.parseInt(s[3]);
			while (true) {
				c -= b;
				if (c <= 0) {
					out.write("Yes");
					break;
				}
				a -= d;
				if (a <= 0) {
					out.write("No");
					break;
				}
			}
			out.close();
		}
	}

}