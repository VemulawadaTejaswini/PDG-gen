import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long ans = modPow(10, n);

		ans -= modPow(9, n);

		if (ans < 0){
			ans += 1000000007;
		}

		ans -= modPow(9, n);

		if (ans < 0){
			ans += 1000000007;
		}

		ans += modPow(8, n);

		ans %= 1000000007;

		System.out.println(ans);;
	}

	public static long modPow (long base, long pow ){

		long ret = base;

		for (int i=0; i<pow-1; i++){

			ret *= base;
			ret %= 1000000007;

		}
		return ret;
	}
}