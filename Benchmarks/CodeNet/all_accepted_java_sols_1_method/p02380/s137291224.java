import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double C = sc.nextDouble();

		double cosC = Math.cos(C * (Math.PI / 180));
		double sinC = Math.sin(C * (Math.PI / 180));
		double S = a * b * sinC / 2;
		double x2 = b*cosC;
		double y2 = b*sinC;

		double L1=(x2-a)*(x2-a);
		double L2=(y2)*(y2);

		System.out.println(S);
		double L = Math.sqrt(L1 + L2);
		System.out.println(L + a + b);
		System.out.println(b * sinC);
    }
}
