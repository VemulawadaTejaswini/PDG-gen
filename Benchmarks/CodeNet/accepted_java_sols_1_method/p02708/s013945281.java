import java.util.Scanner;

public class Main {

	int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long sum =0;
		for (long i=K;i<=N+1;i++) {
			long min = (i-1)*i/2;
			long max = (N+N-i+1)*i/2;
			long temp = (max-min+1)%1000000007l;
			sum = (sum+temp)%1000000007l;
		}
		System.out.println(sum);
	}
}