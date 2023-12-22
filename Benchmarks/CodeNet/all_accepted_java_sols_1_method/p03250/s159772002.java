import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		int max = Math.max(Math.max(A, B), C);
		int count = 0;
		if(max == A) {
			count = 10 * A + B + C;
		}else if(max == B) {
			count = 10 * B + C + A;
		}else if(max == C) {
			count = 10 * C + A + B;
		}
		System.out.println(count);

	}
}
