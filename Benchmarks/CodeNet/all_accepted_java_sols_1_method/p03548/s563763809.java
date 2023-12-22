import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int n = 0;

		while ((y + z) * n + z <= x) {
			n++;
		}
		System.out.println(n - 1);
		sc.close();
	}

}
