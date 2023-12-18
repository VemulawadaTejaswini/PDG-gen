import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		long[] A = new long[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}

		PrintWriter pw = new PrintWriter(System.out);
		for(int i=K; i<N; i++) {
			if(A[i] > A[i-K]) {
				pw.println("Yes");
			}else {
				pw.println("No");
			}
		}
		pw.flush();

	}


}
