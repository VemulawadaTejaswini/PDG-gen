import java.util.Scanner;

public class Main {
	static int digit(int num) {
		if (num == 0) {
			return 1;
		} else {
			int cnt = 0;
			while (num > 0) {
				++cnt;
				num /= 10;
			}
			return cnt;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(digit(a + b));
		}
		sc.close();
	}
}
