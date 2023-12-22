import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		Arrays.setAll(A, i -> sc.nextLong());
		long ans = 0, t = 0;
		int i = 0, j = 0;
		while(j < N) {
			if(i < N && (A[i] ^ t) == A[i] + t) {
				ans++;
				t += A[i];
				i++;
			}
			else {
				t -= A[j];
				j++;
				ans += i - j;
			}
		}
		System.out.println(ans);
	}

}
