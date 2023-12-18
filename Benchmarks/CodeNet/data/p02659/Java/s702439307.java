import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a;
		double b;
		a = sc.nextLong();
		b = sc.nextDouble();
		System.out.println(Math.round(Math.floor(a * b)));
	}
}