import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(A);
		// 0があるなら答えは必ず0
		if(A[0] == 0) {
			prtln(0);
			return;
		}
		long answer = 1L;
		for(int i = 0; i < N; i++) {
			if(A[i] <= (long)(1e18) / answer) {
				answer *= A[i];
			} else {
				prtln(-1);
				return;
			}
		}
		prtln(answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}