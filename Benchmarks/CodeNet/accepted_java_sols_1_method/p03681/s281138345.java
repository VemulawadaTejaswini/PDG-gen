import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		if(Math.abs(N - M) >= 2) {
			System.out.println(0);
		} else {
			long c = 1000000000 + 7;
			long tempN = 1;
			
			for(long i = 1; i <= N; i++) {
				tempN = tempN * i % c;
			}
			
			long ans = tempN;
			
			for(long i = 1; i <= M; i++) {
				ans = ans * i % c;
			}
			if(Math.abs(N - M) == 1) {
				System.out.println(ans);
			} else {
				System.out.println(ans * 2 % c);
			}
		}
	}
}
