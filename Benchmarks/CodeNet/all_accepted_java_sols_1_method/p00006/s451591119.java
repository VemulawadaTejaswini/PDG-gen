import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] main) {
		String str = sc.next();

		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
	}
}