import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int min = n + 1;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int next = scan.nextInt();
			if (min > next) {
				min = next;
				ans++;
			}
		}
		System.out.println(ans);

		scan.close();
	}
}
