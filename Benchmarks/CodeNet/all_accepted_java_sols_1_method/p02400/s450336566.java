import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%f %f\n", Math.PI * r*r, 2*r * Math.PI);
		sc.close();
	}
}