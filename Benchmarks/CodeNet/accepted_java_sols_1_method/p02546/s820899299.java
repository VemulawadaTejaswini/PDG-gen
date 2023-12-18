import java.util.Scanner;

public class Main {

	public static long[] nums;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();

		System.out.println(S.endsWith("s") ? S + "es" : S + "s");
	}
}