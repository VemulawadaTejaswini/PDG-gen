import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if (Math.abs(N-M)>1) {
			System.out.println(0);
			return ;
		}

		if (M>N) {
			long temp =N;
			N = M;
			M = temp;
		}
		long sum = 1;
		for (int i=0;i<N;i++) {
			sum = (sum *(N-i))%1000000007;
			if (M-i>0) {
				sum = (sum *(M-i))%1000000007;
			}
		}
		if (N==M) {
			sum = (sum*2)%1000000007;
		}
		System.out.println(sum);
	}
}