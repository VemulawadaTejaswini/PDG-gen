import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		long K = sc.nextInt();
		if (A >= K) {
			System.out.println(K);
		} else if (A + B >= K) {
			System.out.println(A);
		} else {
			System.out.println(A - (K - A - B));
		}
	}
}
