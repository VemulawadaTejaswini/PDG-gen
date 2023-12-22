import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int num = 0, c = i;
			for (int j = 0; j < 5; j++) {
				num += c % 10;
				c = c / 10;
			}
			if (a <= num && num <= b) {
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
