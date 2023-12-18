
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		if (A != 1 && B != 1) {
			System.out.println(1);
		} else if (A != 2 && B != 2) {
			System.out.println(2);
		} else if (A != 3 && B != 3) {
			System.out.println(3);
		}
		in.close();
	}
}