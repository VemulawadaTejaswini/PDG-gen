import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		List<Character> list = new ArrayList<Character>();
		list.add(input.charAt(0));
		for (int i = 1; i < input.length(); i++) {
			if (!list.contains(input.charAt(i))) {
				list.add(input.charAt(i));
			}
		}

		if (list.size() == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}