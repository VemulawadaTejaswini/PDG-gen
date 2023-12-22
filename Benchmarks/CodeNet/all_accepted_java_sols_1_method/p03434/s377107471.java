import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int a = 0;
		int b = 0;
		int cnt = 0;
		for(int i = N - 1; i >= 0; i--) {
			if(cnt % 2 == 0) {
				a += A[i];
			} else {
				b += A[i];
			}
			cnt++;
		}
		
		System.out.println(a - b);
	}
}
