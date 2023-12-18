import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		System.out.printf("%f\n", Math.pow(l / 3., 3));
	}
}
