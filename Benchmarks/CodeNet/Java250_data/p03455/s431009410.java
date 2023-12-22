import java.util.Scanner;

public class Main {

	public static String EVEN = "Even";
	public static String ODD = "Odd";

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int a2 = s.nextInt();

		String ret;
		if (a1 * a2 % 2 == 0) {
			ret = EVEN;
		} else {
			ret = ODD;
		}

		System.out.println(ret);
	}

}
