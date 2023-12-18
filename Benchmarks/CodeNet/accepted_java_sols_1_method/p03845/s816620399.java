import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		long sum =0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			sum +=A[i];
		}
		int M = sc.nextInt();
		for (int i=0;i<M;i++) {
			int q = sc.nextInt();
			int t= sc.nextInt();
			System.out.println(sum-A[q-1]+t);
		}
	}
}