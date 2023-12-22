import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double X = sc.nextDouble();
		int T = sc.nextInt();
		sc.close();
		double ans = N / X;
		System.out.println((int)(Math.ceil(ans)*T));
	}
}

