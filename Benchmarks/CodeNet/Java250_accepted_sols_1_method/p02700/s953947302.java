import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	static InputStreamReader in = new InputStreamReader(System.in);
	static PrintWriter out = new PrintWriter(System.out);

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
					out.println("Yes");
					break;
				}
				a -= d;
				if (a <= 0) {
					out.println("No");
					break;
				}
			}
			out.flush();
		}
	}
	
}