import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		sc.close();
		if(N > M) {
			long t = M;
			M = N;
			N = t;
		}
		if(N == 1 && M == 1) {
			System.out.println(1);
		}else if(N == 1) {
			System.out.println(M - 2);
		}else if(N == 2) {
			System.out.println(0);
		}else {
			long t = N * M - 2 * M - 2 * (N - 2);
			System.out.println(t);
		}
	}
}