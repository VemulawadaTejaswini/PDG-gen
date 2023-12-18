import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int a = N;
		int fx = 0;
		while(a>=10) {
			fx += a % 10;
			a /= 10;
		}
		fx += a;

		System.out.print(N%fx==0 ? "Yes" : "No");

	}
}