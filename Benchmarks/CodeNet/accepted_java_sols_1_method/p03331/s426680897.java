import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int ans = 0;
		if (n % 10 == 0) {
			ans = 10;
		} else {
			while (n > 0) {
				ans += n % 10;
				n = n / 10;
			}
		}
		System.out.println(ans);
	}
}
