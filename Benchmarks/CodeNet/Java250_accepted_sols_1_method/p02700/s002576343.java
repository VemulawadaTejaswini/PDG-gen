import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int d = Integer.parseInt(s[3]);
			while (true) {
				c -= b;
				if (c <= 0) {
					System.out.println("Yes");
					return;
				}
				a -= d;
				if (a <= 0) {
					System.out.println("No");
					return;
				}
			}
		}
	}
}