import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int ans=0;
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			sc.close();

			for (int i = 1; i <= N; i++) {
				int sum = sum(i);
				if (A <= sum && sum <= B) {
					ans+=i;
				}
			}

			System.out.println(ans);
		}

		private static int sum(int i) {
			int sumDigits = 0;
			while( i != 0) {
				sumDigits += i % 10;
				i /= 10;
			}
			return sumDigits;
		}
}