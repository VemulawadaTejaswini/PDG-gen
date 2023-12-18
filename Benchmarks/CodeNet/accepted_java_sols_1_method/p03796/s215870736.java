import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ret = 1;
		for (int i = 1; i < n + 1; i++) {
			ret *= i;
			ret %= 1000000007;
		}
		System.out.println(ret);
	}

}