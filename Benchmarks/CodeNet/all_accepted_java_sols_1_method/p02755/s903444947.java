import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = -1;
		for (int i = 1; i <= 1009; i++) {
			if (Math.floor(i * 0.08) == a && Math.floor(i * 0.1) == b) {
				ans = i;
				break;
			}
		}

		System.out.println((int) ans);

		sc.close();
	}
}