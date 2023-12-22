import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		scanner.close();
		String diff = line2.substring(0, line2.length() - 1);
		if (line1.equals(diff)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
