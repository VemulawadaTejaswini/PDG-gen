import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		double c = 3.305785;
		double ans = a * b / c;
		System.out.println(ans);
	}
}
