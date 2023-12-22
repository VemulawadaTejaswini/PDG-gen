import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();

		final int divide = 2019;
		long ans =1000000000;

		if(R - L >= 2019)System.out.println(0);
		else {
			for(long i=L; i<R; i++) {
				for(long j =i+1; j<=R; j++) {
					ans = Math.min(ans, (i*j)%divide);
				}
			}
			System.out.println(ans);
		}
	}

}
