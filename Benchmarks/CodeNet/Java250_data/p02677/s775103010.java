import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double C = 0;
		double m = M*6;
		double h = H*30 + m/12;
		sc.close();

		double k = Math.abs(h-m);

		double K = Math.cos(Math.toRadians(k));

		C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2*A*B*K);

		System.out.println(C);
	}

}