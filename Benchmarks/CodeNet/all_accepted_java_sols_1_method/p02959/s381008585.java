import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N+1];
		long B[] = new long[N];
		for (int i=0;i<N+1;i++) {
			A[i] = sc.nextLong();
		}
		for (int i=0;i<N;i++) {
			B[i] = sc.nextLong();
		}
		long sum = 0;
		for (int i=0;i<N;i++) {
			if (A[i]<B[i]) {
				B[i]-=A[i];
				sum +=A[i];
				if (A[i+1]>B[i]) {
					sum +=B[i];
					A[i+1]-=B[i];
				} else {
					sum +=A[i+1];
					A[i+1]=0;
				}
			} else {
				sum +=B[i];
			}
		}
		System.out.println(sum);
	}
}
