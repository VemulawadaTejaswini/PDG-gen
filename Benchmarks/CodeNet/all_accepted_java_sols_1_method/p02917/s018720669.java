import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N-1];
		long sumA = 0;

		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}

		sumA += B[0];
		for (int i = 1; i < B.length; i++) {sumA += Math.min(B[i], B[i-1]);}
		sumA += B[N - 2];

		System.out.println(sumA);
	}

}