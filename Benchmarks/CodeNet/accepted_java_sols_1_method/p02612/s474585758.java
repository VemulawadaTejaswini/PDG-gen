import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans = n % 1000;
		if (ans == 0) {
			System.out.println(0);
		} else {
			System.out.println(1000 - ans);
		}
	}
}
