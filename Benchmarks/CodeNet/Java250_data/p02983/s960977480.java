import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextInt();
		long r = sc.nextInt();

		if(r-l+1 >= 2019) {
			System.out.println("0");
			return;
		}
		long ans = 2019;
		for(long i=l; i<r; i++) {
			for(long j=i+1; j<=r; j++) {
				long tmp = (i*j)%2019;
				ans = Math.min(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}
