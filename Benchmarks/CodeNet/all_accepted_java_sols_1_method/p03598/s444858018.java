import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x <= k - x) {
				result += x * 2;
			} else {
				result += (k - x) * 2;
			}
		}
		System.out.println(result);
	}

}
