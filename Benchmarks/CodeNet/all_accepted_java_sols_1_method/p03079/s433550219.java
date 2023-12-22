import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String correct = "Yes";
		String incorrectAnswer = "No";
		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		List<String> str = new ArrayList<>();
		str.add(scan.next());
		str.add(scan.next());
		str.add(scan.next());

		for (String s : str) {
			if (!s.equals(str.get(0))) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println(correct);
		} else {
			System.out.println(incorrectAnswer);
		}
	}
}
