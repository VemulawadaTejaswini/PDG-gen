import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		boolean[] t = new boolean[N];
		for(int i = 1; i < N; i++)
			if(A[i] == A[i-1]) {
				t[i] = true;
				t[i-1] = true;
			}
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(!t[i]) {
				t[i] = true;
				ans++;
				for(int j = i+1; j < N; j++)
					if(A[j] % A[i] == 0)
						t[j] = true;
			}
		}
		System.out.println(ans);
	}

}