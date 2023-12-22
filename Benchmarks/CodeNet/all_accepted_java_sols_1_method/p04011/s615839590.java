import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 宿泊日数
		int k = sc.nextInt();
		int x = sc.nextInt(); // k泊目までの宿泊費
		int y = sc.nextInt(); // k+1泊目以降の宿泊費
		sc.close();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i <= k) {
				sum += x;
			}
			if (i > k) {
				sum += y;
			}
		}

		System.out.println(sum);

	}

}
