import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum = 0, ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i);
			for (int j = 0; j < s.length(); j++) {
				sum += Character.getNumericValue(s.charAt(j));
			}
			if (sum >= a && sum <= b) {
				ans += i;
			}
			sum = 0;
		}
		System.out.println(ans);
	}

}