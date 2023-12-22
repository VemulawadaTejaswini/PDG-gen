import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long [N];
		
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
			if(A[i]==0) {
				System.out.println(0);
				return;
			}
		}
		
		Arrays.sort(A);
		
		long ans =1;
		
		for(int i=N-1;i>=0;i--) {
			if(A[i]> 1000000000000000000L/ans) {
				System.out.println(-1);
				return;
			}else {
				ans *= A[i];
			}
		}
		System.out.println(ans);
		sc.close();
	}

}