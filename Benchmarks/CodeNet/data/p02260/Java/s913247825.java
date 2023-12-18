import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []A = new int[N];
		int i, j, k, t, min;
		int l = 0, count = 0;
		
		for(i = 0;i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(j = 0;j < A.length; j++) {
			min = A[j];
			for(k = j; k < A.length-1; k++) {
				if(min > A[k+1]) {
					min = A[k+1];
					l = k+1;
				}
			}
			if(A[j] != min) {
				A[l] = A[j];
				A[j] = min;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
