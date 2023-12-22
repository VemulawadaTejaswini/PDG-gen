import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();

		int[] con_bra = new int[A + 1];

		for (int i = 1; i < A; i++) {
			int let = sc.nextInt();
			con_bra[let]++;
		}

		for (int i = 1; i <= A; i++) {
			System.out.println(con_bra[i]);
		}

	}
}