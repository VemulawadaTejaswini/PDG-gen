import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long sum = 0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
			sum +=A[i];
		}
		long min = Long.MAX_VALUE;
		long front= 0;
		for (int i=0;i<N;i++) {
			front +=A[i];
			if (Math.abs(sum - 2*front)<min) {
				min = Math.abs(sum - 2*front);
			}
		}
		System.out.println(min);
	}
}
