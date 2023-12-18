import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());

		int totalMove = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			totalMove += Math.min(x, k - x) * 2;
		}

		System.out.println(totalMove);

		sc.close();
	}
}