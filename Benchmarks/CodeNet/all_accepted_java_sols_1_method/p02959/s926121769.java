import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N + 1];
		long sum = 0;
		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			if(B[i]>=A[i]) {
				B[i]-=A[i];
				A[i]=0;
				if(B[i]>=A[i+1]) {
					A[i+1]=0;
				} else {
					A[i+1] -= B[i];
				}
			} else {
				A[i] -=B[i];
			}
		}
		long sum2 = 0;
		for (int i = 0; i <= N; i++) {
			sum2 += A[i];
		}
		System.out.println(sum-sum2);

	}
}
