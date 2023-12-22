import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int cnt = 0, tmp = 0;
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = N - 1; j > i; j--) {
				if(A[j] < A[j - 1]) {
					tmp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmp;
					
					cnt++;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(i == N - 1) {
				System.out.print(A[i]);
			} else {
				System.out.print(A[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println(cnt);
	}
}