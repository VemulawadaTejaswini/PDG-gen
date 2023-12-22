import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans = 0;
		int kt = 1;

		if (B == 1) {
			System.out.println(0);
			return;
		}

		while(kt < B) {
			ans++;
			kt -= 1;
			kt += A;
		}
		System.out.println(ans);
	}
}
