import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("a")) {
				a++;
			} else if (str[i].equals("b")) {
				b++;
			} else {
				c++;
			}
		}

		int diff1 = Math.abs(a - b);
		int diff2 = Math.abs(b - c);
		int diff3 = Math.abs(c - a);

		if (diff1 <= 1 && diff2 <= 1 && diff3 <= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
