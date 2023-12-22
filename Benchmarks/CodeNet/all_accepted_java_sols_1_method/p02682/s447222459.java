import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int result = 0;
		if (A >= K) {
			result = K;
		} else if ((A + B) >= K) {
			result = A;
		} else {
			result = A - (K - A - B);
		}
		System.out.println(result);

	}

}
