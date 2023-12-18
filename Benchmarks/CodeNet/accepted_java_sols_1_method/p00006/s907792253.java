import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		if (a.length() <= 20) {
			StringBuffer buffer = new StringBuffer(a);
			System.out.println(buffer.reverse());
		}
	}
}