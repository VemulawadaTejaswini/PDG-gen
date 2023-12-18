import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long a = in.nextLong();
		String op = in.next();
		Long b = in.nextLong();

		if(op.equals("+")) {
			System.out.println(a + b);

		} else {
			System.out.println(a - b);
		}
	}
}