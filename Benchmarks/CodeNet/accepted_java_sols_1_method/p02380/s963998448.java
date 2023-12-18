import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		double menseki = (double)a * b * Math.sin(c * Math.PI/180) / 2;
		System.out.println(menseki);

		double another = Math.pow( (a*a + b*b - 2*a*b * Math.cos(c * Math.PI/180) ), 0.5);
		System.out.println(a + b + another);

		double height = Math.sin(c * Math.PI/180) * b;
		System.out.println(height);

	}
}