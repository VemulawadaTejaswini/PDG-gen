import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		long ans = 1;
		if (k <= a) {
			ans += k;
		} else {
			if (a < b - 1) {
				ans = a;
				k -= (a - 1);
				int tmp = k / 2;
				ans += ((long)(b - a)*(long)tmp);
				tmp = k % 2;
				ans += tmp;
			}
			else {
				ans += k;
			}
		}
		System.out.println(ans);
	}

}
