import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		double ans = (l*l*l)/27;
		System.out.printf("%.10f", ans);
	}
}
