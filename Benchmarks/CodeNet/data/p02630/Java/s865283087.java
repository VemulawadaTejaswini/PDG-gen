
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String Ns = sc.next();
		int N = Integer.parseInt(Ns);
		long[] A = new long[N];
		for(int i = 0; i < N ; i++) {
			String line = sc.next();
			A[i] = Integer.parseInt(line);
		}

		String Qs = sc.next();
		int Q = Integer.parseInt(Qs);
		int[] B = new int[Q];
		int[] C = new int[Q];

		for(int i = 0; i < Q; i++) {
			String Bs = sc.next();
			String Cs = sc.next();
			B[i] = Integer.parseInt(Bs);
			C[i] = Integer.parseInt(Cs);
		}

		long sum = 0;
		for(int i = 0; i < Q; i++) {
			sum = 0;
			Arrays.sort(A);
			for(int j = 0; j < A.length; j++) {
				while(B[i] == A[j]) {
					A[j] = C[i];
//					sum = sum + A[j];
				}
				sum = sum + A[j];
			}
			System.out.println(sum);
		}
	}

}
