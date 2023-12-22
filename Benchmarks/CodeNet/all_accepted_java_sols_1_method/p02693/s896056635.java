import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int d = a; d <= b; ++d) {
			if (d % k == 0) {
				System.out.println("OK");
				return;
			}
		}

		System.out.println("NG");
	}

}
