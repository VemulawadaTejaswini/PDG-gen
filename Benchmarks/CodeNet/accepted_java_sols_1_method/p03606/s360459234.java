import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l;
		int r;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			sum += (r - l + 1);
		}
		System.out.println(sum);
	}
}
