import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N-1];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			B[i] = sc.nextInt();
		}
		for (int i=0;i<N-1;i++) {
			C[i] = sc.nextInt();
		}
		int sum =0;
		for (int i=0;i<N;i++) {
			sum +=B[i];
		}
		for (int i=1;i<N;i++) {
			if (A[i-1]+1==A[i]) {
				sum +=C[A[i-1]-1];
			}
		}
		System.out.println(sum);
	}

}
