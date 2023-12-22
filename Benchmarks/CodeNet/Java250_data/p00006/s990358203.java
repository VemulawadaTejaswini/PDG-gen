import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();

		StringBuffer sb = new StringBuffer(n);
		String dst = sb.reverse().toString();
		System.out.println(dst);
	}
}