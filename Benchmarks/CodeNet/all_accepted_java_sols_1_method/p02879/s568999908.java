import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;

		if ((A <= 9) && (B <= 9)) {
			ans = (A * B);
		} else {
			ans = -1;
		}

		System.out.println(ans);

		sc.close();
	}
}