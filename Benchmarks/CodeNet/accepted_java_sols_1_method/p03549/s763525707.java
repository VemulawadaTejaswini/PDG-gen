import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//y = x / p = (1900M + 100(N-M)) * 2^M
		System.out.println((int)((1900*m + 100*(n-m))*Math.pow(2, m)));
	}
}