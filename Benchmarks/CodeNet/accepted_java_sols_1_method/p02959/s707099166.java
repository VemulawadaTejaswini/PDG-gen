import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N + 1];
		long[] B = new long[N];
		for(int i = 0; i < N + 1; i++) {
			A[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		sc.close();
		long hit = 0L;
		for(int i = 0; i < N; i++) {
			long a = A[i];
			long b = B[i];
			// 勇者iが倒せる数はB[i]
			// A[i]のモンスターを倒したときの残倒せる数とモンスターの残数を設定
			if(a > b) {
				hit += b;
				b = 0L;
			} else {
				hit += a;
				b -= a;
			}
			// A[i + 1]のモンスターを倒した後のモンスターの残数を設定
			long a_1 = A[i + 1];
			if(a_1 > b) {
				hit += b;
				a_1 -= b;
			} else {
				hit += a_1;
				a_1 = 0L;
			}
			A[i + 1] = a_1;
		}
		System.out.println(hit);
	}
}
