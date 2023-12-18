import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "str ";
		String delimeter = ": ";

		for (int i = 1; sc.hasNextInt(); i++) {
			if (sc.nextInt() == 0) {
				break;
			}
			System.out.println(str + i + delimeter + sc.nextInt());
		}
	}
}