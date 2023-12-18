import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans = 0;
		
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		if(N >= K){
			for(int i = 0; i < N - K; i++){
				ans = ans + a[i];
			}
		} else {
			ans = 0;
		}
		
		System.out.println(ans);
	}
}
