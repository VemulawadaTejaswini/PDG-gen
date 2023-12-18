import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 0;
		for (int i = 0; i < n; ++i) {
			String str1 = sc.next(), str2 = sc.next();
			int res = str1.compareTo(str2);
			if (res > 0) {
				a += 3;
			} else if (res < 0) {
				b += 3;
			} else {
				a += 1;
				b += 1;
			}
		}
		System.out.printf("%d %d\n", a, b);
		sc.close();
	}
}
