import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		//variety
		String str;
		int a, b, c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		int N = Integer.parseInt(str);
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			String[] num = str.split(" ", 0);
			a = Integer.parseInt(num[0]);
			b = Integer.parseInt(num[1]);
			c = Integer.parseInt(num[2]);
			if (a >= b && a >= c) {
				if (a * a == b * b + c * c) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				if (b >= a && b >= c) {
					if (b * b == a * a + c * c) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else {
					if (c >= a && c >= b) {
						if (c * c == a * a + b * b) {
							System.out.println("YES");
						} else {
							System.out.println("NO");
						}
					}
				}
			}
		}
	}

}