import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			String s = "" + i;
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
				sum += Integer.parseInt("" + s.charAt(j));
			}
			if (a <= sum && sum <= b) {
				ans += i;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
