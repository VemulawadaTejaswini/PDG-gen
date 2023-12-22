import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long n = N - 1;
		for(long i = 1; i <= N; i++) {
			if(i > N / i) {
				break;
			}
			if(N % i == 0 && i + (N / i) - 2 <= n) {
				n = i + (N / i) - 2;
			}
		}	
		System.out.println(n);
	}

}
