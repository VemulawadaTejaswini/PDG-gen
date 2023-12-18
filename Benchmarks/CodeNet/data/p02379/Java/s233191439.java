import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		double result = 0;
		result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.printf("%f%n", result);
		sc.close();
	}
}
