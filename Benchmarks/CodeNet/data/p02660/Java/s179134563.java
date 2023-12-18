import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long nn = n;
		sc.close();
		int ans = 0;
		boolean endflag = false;
		for (long l = 2;l*l<=nn; l++) {
			if (n == 1) {
				break;
			}
			long l2 = l;
			while (true) {
				if (n % l2 == 0) {
					ans +=1;
					n = n / l2;
					l2 = l2 * l;
				} else if (n % l ==0 || n < l) {
					endflag = true;
					break;
				} else {
					break;
				}
			}
			if (endflag) break;
		}
		if (n >1 && !endflag) ans++;
		System.out.println(ans);
	}
}
