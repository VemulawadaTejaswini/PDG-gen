import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			int result1 = A * B;
			int result2 = C * D;
			System.out.println(result1 > result2 ? result1 : result2);

		}
	}
}
