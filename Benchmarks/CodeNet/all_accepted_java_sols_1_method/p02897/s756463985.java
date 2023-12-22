import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = ((N + 1) / 2);
		double dN = N;
		double dP = P;

		double ans = dP / dN;

		System.out.println(String.format("%.10f",ans));
	}
}