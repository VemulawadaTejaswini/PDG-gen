import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		Arrays.parallelSort(A);
		long sum =0;
		sum +=A[N-1];
		for (int i=N-2;i>=N/2;i--) {
			sum +=2*A[i];
		}
		if (N%2==1) {
			sum -=A[N/2];
		}
		System.out.println(sum);
	}

}