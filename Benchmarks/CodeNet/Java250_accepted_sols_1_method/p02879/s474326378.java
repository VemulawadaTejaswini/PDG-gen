
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		if(A > 0 && A <10 && B > 0&& B <10) {
			System.out.println(A*B);
		} else {
			System.out.println(-1);
		}

	}
}