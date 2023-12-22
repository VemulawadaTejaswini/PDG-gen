import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = (A + B) / 2;

		if (A % 2 == 0 && B % 2 == 0) {
			System.out.println(K);
		} else if (A % 2 == 1 && B % 2 == 1) {
			System.out.println(K);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}