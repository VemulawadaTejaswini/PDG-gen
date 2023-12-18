import java.util.Scanner;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double x[] = new double[100];
		double y[] = new double[100];
		double p_1 = 0,p_2 = 0,p_3 = 0,p_infinity = -1;

		int N = scanner.nextInt();

		for(int i = 0; i < N; i++)x[i] = scanner.nextDouble();
		for(int i = 0; i < N; i++)y[i] = scanner.nextDouble();

		for(int i = 0; i < N; i++){
			p_1 += Math.abs(x[i]-y[i]);
			p_2 += (x[i]-y[i])*(x[i]-y[i]);
			p_3 += Math.abs((x[i]-y[i])*(x[i]-y[i])*(x[i]-y[i]));
			p_infinity = Math.max(p_infinity, Math.abs(x[i]-y[i]));
		}

		System.out.println(p_1);
		System.out.println(p_2);
		System.out.println(Math.cbrt(p_3));
		System.out.println(p_infinity);
	}
}


