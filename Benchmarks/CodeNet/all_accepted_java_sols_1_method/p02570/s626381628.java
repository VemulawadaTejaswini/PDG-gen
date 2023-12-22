import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		sc.close();

		if ((d + s - 1) / s <= t) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
