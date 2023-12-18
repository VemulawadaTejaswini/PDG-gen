import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		long ans = 0L;
		long[] array = new long[n+1];
		for(long j=1L;j<=n;j++) {
			for(long i=1;i*j<=n;i++) {
				array[(int) (i*j)] = array[(int) (i*j)] + 1L;
			}
		}
		for(long j=1L;j<=n;j++) {
			ans = ans + j*array[(int) j];
		}
		System.out.println(ans);
	}
}
