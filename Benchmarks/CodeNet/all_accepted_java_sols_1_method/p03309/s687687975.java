import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int median = 0;
		long ans= 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt()-i-1;
		}
		Arrays.sort(A);
		if(N % 2 == 1)
			median = A[N/2];
		else
			median = (A[N/2-1] + A[N/2]) / 2;
		for(int i = 0; i < N; i++)
			ans += Math.abs(A[i]-median);
		System.out.println(ans);
		
	}

}