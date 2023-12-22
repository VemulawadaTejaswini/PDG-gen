import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int i = 0;
		String ans = "";
		if (n == 0) {
			ans = "0";
		}
		while (Math.abs(n) > 0) {
			if (n % (-2) == 0) {
				if (Math.pow(-2, i) < 0) {
					ans = "1" + ans;
					n--;
				} else {
					ans = "0" + ans;
				}
			} else {
				ans = "1" + ans;
				n--;
			}
			n = n / (-2);
		}

		System.out.println(ans);

		sc.close();
	}
}
