import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int A = Integer.parseInt(sc.next());
			int B = Integer.parseInt(sc.next());
			int C = Integer.parseInt(sc.next());
			int manzoku = Math.min((B / A), C);
			System.out.println(manzoku);
		} // Scanner Close
	}
}