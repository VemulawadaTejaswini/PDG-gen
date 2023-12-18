import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] number;
		number = new char[1001];
		int num = 0;
		int ans = 0;

		while (true) {
			String keta = s.next();
			number=keta.toCharArray();
			for (int i = 0; i < number.length; i++) {
				num = number[i] - '0';
				ans += num;
			}

			if (number[0] == '0')
				break;
			System.out.println(ans);
		}
	}
}