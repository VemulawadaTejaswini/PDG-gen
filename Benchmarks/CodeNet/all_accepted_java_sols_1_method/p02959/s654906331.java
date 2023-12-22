import java.util.*;
public class Main {
	
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];
		int B[] = new int[N];
		for(int i=0;i<N+1;i++)A[i]=sc.nextInt();
		for(int i=0;i<N;i++)B[i]=sc.nextInt();
		sc.close();
		long ans = 0;
		for(int i=0;i<N;i++) {
			if(B[i]>A[i]) {
				ans += A[i];
				int remain = B[i]-A[i];
				//余力で次の町
				int nextBeat = Math.min(A[i+1], remain);
				ans += nextBeat;
				A[i+1] -= nextBeat;

			}else {
				ans += B[i];
			}
		}
		System.out.println(ans);
	}
}