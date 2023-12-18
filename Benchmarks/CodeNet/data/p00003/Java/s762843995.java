import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		try {
			while ((str = br.readLine()) != null) {
				String[] num = str.split(" ");
				int a = Integer.parseInt(num[0]);
				int b = Integer.parseInt(num[1]);
				int c = Integer.parseInt(num[2]);
				if (1 <= a && a <= 1000 && 1 <= b && b <= 1000 && 1 <= c && c <= 1000) {
					a *= a;
					b *= b;
					c *= c;
					if (a == b + c || b == a + c || c == a + b) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}