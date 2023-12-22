import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt();
		int[] arr = new int[N+1];
		int[] psa = new int[N+1];
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			arr[a]++;
		}
		for(int i=1; i<=N; i++) {
			psa[i] = psa[i-1] + arr[i];
		}
		int ans = Math.min(psa[X], psa[N]-psa[X-1]);
		System.out.println(ans);

		
		
		
		
		
	}

}
