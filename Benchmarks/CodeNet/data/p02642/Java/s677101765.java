
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final int Amax = 1000001;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		
		int[] cnt = new int[Amax];
		
		for (int x : A) {
			if(cnt[x] != 0) {
				cnt[x] =2;
				continue;
			}
			for(int i = x; i < Amax; i+= x ) {
				cnt[i] += 1;
			}			
		}
		int ans = 0;
		for(int x: A) {
			if(cnt[x] == 1)
				ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}
