import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int K =sc.nextInt();
		int[] A =new int[N];
		int L =0;
		int M =0;
		
		for(int i=0;i<N;i++){
			A[i] =sc.nextInt();
		}
		
		Arrays.sort(A);
		
		L = N-K;
		for(int i=L; i<N; i++){
			M += A[i];
		}
			System.out.println(M);
	}
}