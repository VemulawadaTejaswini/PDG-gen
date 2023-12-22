import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> gradingResult = new ArrayList<>();
		while (true) {
			int m = s.nextInt();
			int f = s.nextInt();
			int r = s.nextInt();
			s.nextLine();
			if (m == -1 && f == -1 && r == -1) {
				break;
			}
			if ((m == -1 || f == -1)) {
				gradingResult.add("F");
			} else if ((m + f) >= 80) {
				gradingResult.add("A");
			} else if (((m + f) < 80) && ((m + f) >= 65)) {
				gradingResult.add("B");
			} else if (((m + f) < 65) && ((m + f) >= 50)) {
				gradingResult.add("C");
			} else if (((m + f) < 50) && ((m + f) >= 30)) {

				if (r >= 50) {
					gradingResult.add("C");
				} else {
					gradingResult.add("D");
				}
			} else if ((m + f) < 30) {
				gradingResult.add("F");
			}

		}
		for (int i = 0; i < gradingResult.size(); i++) {
			System.out.println(gradingResult.get(i));
		}
	}

}