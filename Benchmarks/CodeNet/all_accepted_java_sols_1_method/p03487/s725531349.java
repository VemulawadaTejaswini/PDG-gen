import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			if(x > N)
				ans += 1;
			else
				A[x] += 1;
		}
		for(int i = 1; i <= N; i++) {
			if(A[i] < i)
				ans += A[i];
			else
				ans += A[i] - i;
		}
		System.out.println(ans);

	}

}