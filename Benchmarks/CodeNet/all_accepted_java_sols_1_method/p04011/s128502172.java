import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		int i = 0;
		int sum = 0;

		for (i = 0; i < n; i++) {
			if (i < k) {
				sum = sum + x;
			} else if (i >= k) {
				sum = sum + y;
			}
		}
		System.out.println(sum);
	}

}
