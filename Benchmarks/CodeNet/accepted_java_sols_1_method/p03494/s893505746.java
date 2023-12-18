import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int n = 0;
		int c = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int j = 0; Math.pow(10, 9) > Math.pow(2, j); j++) {
			for(int k = 0; k < N; k++) {
				if(A[k] % 2 == 0) {
					A[k] = A[k]/2;
					c++;
				}
				if(c == N) {
					n++;
				}
			}
			c = 0 ;
		}
		System.out.println(n);
	}

}
