import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		
		final int MAX = 1000000;
		boolean[] used = new boolean[MAX+1];

		int ans = 0;
		for(int i=0; i<N; i++) {
			if(!used[A[i]]) {
				if(i==N-1 || A[i]!=A[i+1]) {
					ans++;
				}
				for(int j=1; j*A[i]<=MAX; j++) {
					used[j*A[i]]=true;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
