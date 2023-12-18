import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for (int i = 8 ; i >= 0 ; i--) {
			sum += n / (int)Math.pow(10, i) - cnt * 10;
			cnt = n / (int)Math.pow(10, i);
		}
		System.out.println(n % sum == 0 ? "Yes" : "No");
	}
}
