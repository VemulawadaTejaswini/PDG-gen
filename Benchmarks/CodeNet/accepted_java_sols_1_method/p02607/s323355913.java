import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int in = sc.nextInt();
			if (i % 2 != 0 && in % 2 != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
