import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 1; i < N; i++) {
			A[i] = sc.nextInt() - 1;
		}
		int ans[] = new int[N];
		for(int i = N - 1; i > 0; i--) {
			ans[A[i]]++;
		}
		for(int i = 0; i < N; i++) {
			System.out.println(ans[i]);
		}
	}
}
