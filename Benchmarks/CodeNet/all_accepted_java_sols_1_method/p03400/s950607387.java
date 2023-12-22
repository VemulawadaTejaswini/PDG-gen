import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int d = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();
		int eatNum = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.nextLine());
			int k = 1;
			while (k <= d) {
				eatNum++;
				k += a;
			}
		}

		System.out.println(eatNum + x);

		sc.close();
	}
}