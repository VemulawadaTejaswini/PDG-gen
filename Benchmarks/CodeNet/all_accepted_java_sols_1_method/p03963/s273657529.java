import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = sc.nextInt();
		long ret = 1;
		for (long i = 0; i < n; i++) {
			if (i == 0) {
				ret *= k;
			} else {
				ret *= k - 1;
			}
		}
		System.out.println(ret);
	}

}