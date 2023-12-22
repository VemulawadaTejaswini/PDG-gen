import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 1000; i++) {
			if (i * 8 / 100 == a && i * 10 / 100 == b) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}
