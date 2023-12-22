import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int tmp;

		tmp = A+B;
		if (tmp < A-B) {
			tmp = A-B;
		}
		if (tmp < A*B) {
			tmp = A*B;
		}

		System.out.println(tmp);

	}

}
