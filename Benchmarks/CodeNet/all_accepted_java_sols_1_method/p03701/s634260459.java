import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 101;
		int sum = 0;
		for (int i=1; i<=n; i++) {
			int s = sc.nextInt();
			sum += s;
			if (s % 10 != 0 && s < min) {
				min = s;
			}
		}
		if (sum % 10 != 0) {
			System.out.println(sum);
		} else if (min == 101) {
			System.out.println(0);
		} else {
			System.out.println(sum-min);
		}
		sc.close();
	}
}