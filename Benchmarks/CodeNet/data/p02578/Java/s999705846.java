import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();

		long ans = 0;
		long max = 0;
		for(int i=0; i<N; i++) {
			if(max>A[i]) {
				ans += max-A[i];
			} else {
				max = A[i];
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
