import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		StringBuffer sb = new StringBuffer(str);
		String result = sb.reverse().toString();

		System.out.println(result);

	}
}