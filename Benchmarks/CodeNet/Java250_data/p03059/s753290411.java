import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int T = scan.nextInt();

		int times = T /A;
		int ans = times * B;

		System.out.println(ans);
	}
}