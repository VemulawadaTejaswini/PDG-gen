import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int []A = new int [N];
		int i, j, t, k, l;
		int count = 0;
		
		for (i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for(j = 0; j <= N-1; j++) {
			for(k = N-1;k > j;k--) {
				if(A[k] < A[k-1]) {
					t = A[k];
					A[k] = A[k-1];
					A[k-1] = t;
					count++;
				}
			}
			
		}
		
		for (l = 0;l < N - 1; l++) {
			System.out.print(A[l] + " ");
		}
		System.out.println(A[N-1]);
		System.out.println(count);
	}
}
