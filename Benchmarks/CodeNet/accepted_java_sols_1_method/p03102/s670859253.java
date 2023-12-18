import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int B[] = new int[M];
		int A[][] = new int[N][M];
		int counter = 0;
		int total = 0;
		for(int i = 0; i<M; i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
			A[i][j] = sc.nextInt();
			}
		}
		
		for(int T = 0; T<N; T++) {
			for(int i = 0; i<M; i++) {
			 	total += A[T][i]*B[i];
			}
			total += C;
			if(total > 0) {
				counter++;
			}
			total = 0;
		}
		System.out.println(counter);
		
		
	}

}