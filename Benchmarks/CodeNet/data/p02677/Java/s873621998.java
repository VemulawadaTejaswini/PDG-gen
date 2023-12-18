import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double C = 0;
		int h = H*30;
		int m = M*6;
		sc.close();
		int k = Math.abs(h-m);
		C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2*A*B*Math.cos(Math.toRadians(k)));

		System.out.println(C);
	}

}