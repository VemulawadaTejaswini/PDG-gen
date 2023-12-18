import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int a = 0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int Q = sc.nextInt();
		int[] B = new int[Q];
		int[] C = new int[Q];
		int[] D = new int[Q];
		for(int i=0; i<Q; i++) {
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<Q; i++) {
			D[i] = 0;
			for(int j=0; j<N; j++) {
				if(A[j]== B[i]) {
					A[j] = C[i];
				}
				D[i] += A[j];
			}
		}
		for(int i=0; i<Q; i++) {
			System.out.println(D[i]);
		}
	}

}