import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		int ans = 0;
		long l = 2;
		if (n == 1) {
			System.out.println(ans);
			return;
		}
		long tmp = l + 1;
		long l2 = l;
		while (true) {
			if (n % l2 == 0) {
				ans +=1;
				n = n / l2;
				l2 = l2 * l;
			} else {
				break;
			}
		}
		l = tmp;
		while (l*l <n) {
			if (n == 1) break;
			tmp = l + 2;
			l2 = l;
			while (true) {
				if (n % l2 == 0) {
					ans +=1;
					n = n / l2;
					l2 = l2 * l;
				} else {
					break;
				}
			}
			l = tmp;
		}
		if (n >1) ans++;
		System.out.println(ans);
	}
}
