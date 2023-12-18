import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		Scanner sc = new Scanner(System.in);
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		int max = 0;
		int i;
		for (i = 0; i < 2; i++) {
			if (A > B) {
				max += A;
				A--;
			} else {
				max += B;
				B--;
			}
		}
		System.out.println(max);
	}
}
