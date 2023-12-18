import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		sc.close();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += l + i;
		}

		if (l <= 0) {
			if (l + n - 1 < 0) {
				System.out.println(sum - (l + n - 1));
			} else {
				System.out.println(sum);
			}
		} else {
			System.out.println(sum - l);
		}
	}
}
