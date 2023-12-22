import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String[] arrStr;
		try {
			loop: while (true) {
				str = br.readLine();
				arrStr = str.split(" ");

				int a = Integer.parseInt(arrStr[0]);
				char op = arrStr[1].charAt(0);
				int b = Integer.parseInt(arrStr[2]);

				int ans = 0;
				switch (op) {
				case '+':
					ans = a + b;
					break;
				case '-':
					ans = a - b;
					break;
				case '*':
					ans = a * b;
					break;
				case '/':
					ans = a / b;
					break;
				case '?':
					break loop;
				}

				System.out.println(ans);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}