
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		int[] X = new int[N];
		for(int i=0; i<N; i++) {
			X[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(X);

		int[] Y = new int[N-K+1];

		//System.out.println("N:" +N);
		//System.out.println("K:" +K);
		for(int i=0; i<N; i++) {
			if(N <= i+K-1) {
				break;
			}
			//System.out.println(i+K-1);
			Y[i] = X[i+K-1] - X[i];

		}

		Arrays.sort(Y);
		System.out.println(Y[0]);
	}
}
