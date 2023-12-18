import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if ((N * A) <= B) {
			System.out.print(N * A);
		} else {
			System.out.print(B);
		}
	}
}
