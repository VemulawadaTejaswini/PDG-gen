import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D, N;
		D = sc.nextInt();
		N = sc.nextInt();

		if (N == 100) N++;
		System.out.println((int)(Math.pow(100, D) * N));
	}
}