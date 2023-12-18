import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long max = sc.nextLong();
		long ans = 0;
		for (int i=1; i<n; i++){

			long a = sc.nextLong();

			if (a > max) {
				max = a;
			} else {
				ans += (max - a);
			}
		}
		System.out.println(ans);
	}


}