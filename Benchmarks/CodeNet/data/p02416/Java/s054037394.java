import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long num, length;
		long ans;
		int i = 0, a = 0;
		String b;
		char c;
		Scanner sc = new Scanner(System.in);
		while (true) {
			ans = 0;
			num = sc.nextInt();
			b = String.valueOf(num);
			length = b.length();
			if (num == 0) {
				break;
			}
			for (i = 0; i < length; ++i) {
				c = b.charAt(i);
				a = c - '0';
				ans += a;
			}
			System.out.println(ans);
		}
		sc.close();
	}

}

