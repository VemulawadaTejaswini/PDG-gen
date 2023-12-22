import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		long ans=Long.MAX_VALUE;
		
		for (int i=0; i<N; i++) {
			X[i] = sc.nextInt();
		}
		
		for (int i=1; i<101; i++) {
			long min = 0;
			
			for (int j=0; j<N; j++) {
				min += (X[j]-i)*(X[j]-i);
			}
			ans = Math.min(ans, min);
		}
		System.out.println(ans);
	}
}