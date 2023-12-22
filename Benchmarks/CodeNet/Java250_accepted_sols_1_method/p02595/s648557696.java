import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long D = sc.nextLong();
		int ans = 0;

		for(int i = 0; i < N; i++) {
			long X = sc.nextLong();
			long Y = sc.nextLong();
			if(X * X + Y * Y <= D * D) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
