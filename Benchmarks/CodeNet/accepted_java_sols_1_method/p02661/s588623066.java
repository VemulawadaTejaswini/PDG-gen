
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		if (N%2==0) {
			System.out.println(B[N/2-1]+B[N/2]-(A[N/2-1]+A[N/2])+1);
		} else {
			System.out.println(B[N/2]-A[N/2]+1);
		}
	}
}
