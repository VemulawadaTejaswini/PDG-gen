import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 173_D
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Long A[] = new Long[N];
		Long Ans = (long) 0;

		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		Arrays.sort(A, Collections.reverseOrder());

		for(int i=0; i<N-1; i++) {
			Ans += A[(i+1)/2];
		}

		System.out.println(Ans);

	}
}
