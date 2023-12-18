import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		int a = D + D + 1;
		int ans = 0;

		ans = N / a + 1;
		if (N % a == 0) ans--;

		System.out.println(ans);
	}
}