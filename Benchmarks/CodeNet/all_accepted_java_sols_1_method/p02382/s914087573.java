import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double x[] = new double[100];
		double y[] = new double[100];
		double p_1 = 0,p_2 = 0,p_3 = 0,p_infinity = -1;

		int n = scanner.nextInt();

		for(int i = 0; i < n; i++)x[i] = scanner.nextDouble();
		for(int i = 0; i < n; i++)y[i] = scanner.nextDouble();

		for(int i = 0; i < n; i++){
			p_1 += Math.abs(x[i]-y[i]);
			p_2 += (x[i]-y[i])*(x[i]-y[i]);
			p_3 += Math.abs((x[i]-y[i])*(x[i]-y[i])*(x[i]-y[i]));
			p_infinity = Math.max(p_infinity, Math.abs(x[i]-y[i]));
		}

		System.out.printf("%.10f\n", p_1);
		System.out.printf("%.10f\n", Math.sqrt(p_2));
		System.out.printf("%.10f\n", Math.cbrt(p_3));
		System.out.printf("%.10f\n", p_infinity);
	}
}
