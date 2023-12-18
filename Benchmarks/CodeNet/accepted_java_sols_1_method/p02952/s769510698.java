import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String tmp = String.valueOf(n);
		int digit = tmp.length();
		int ans = 0;
		for (int i = 1; i < digit; i += 2) {
			int tmp1 = (int) Math.pow(10, i);
			ans += tmp1 - (tmp1 / 10);
		}
		if(digit % 2 != 0) {
			int tmp2 = (int)Math.pow(10, digit - 1);
			ans += n - tmp2 + 1;
		}

		System.out.println(ans);
	}
}
