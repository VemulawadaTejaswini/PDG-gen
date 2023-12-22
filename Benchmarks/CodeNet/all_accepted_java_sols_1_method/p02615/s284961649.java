import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		long ans = A[N-1];

		int index = N-2;
		int cnt = 0;
		for (int i=0;i<N-2;i++) {
			ans += A[index];

			cnt++;
			if (cnt==2) {
				cnt=0;
				index--;
			}
		}
		System.out.println(ans);
	}
}