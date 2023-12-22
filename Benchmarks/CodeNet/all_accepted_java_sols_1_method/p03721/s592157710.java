import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 100001;
		long[]k = new long[m];
		int N = sc.nextInt();
		long K = sc.nextLong();
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			long b = sc.nextInt();
			k[a] += b;
		}
		sc.close();
		long cnt = 0;
		for(int i = 1; i < m; i++) {
			cnt += k[i];
			if(cnt >= K) {
				System.out.println(i);
				System.exit(0);
			}
		}
	}
}