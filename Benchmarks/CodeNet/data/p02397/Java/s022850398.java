import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<String>();

		while (true) {
			String line = sc.nextLine();
			if (line.equals("0 0")) {
				break;
			}
			list.add(line);
		}

		for (String line : list) {

			String[] string = line.split(" ");

			int[] is = new int[2];
			is[0] = Integer.parseInt(string[0]);
			is[1] = Integer.parseInt(string[1]);

			if (is[0] <= is[1]) {
				System.out.println(is[0] + " " + is[1]);
			} else {
				System.out.println(is[1] + " " + is[0]);
			}

			if (is[0] == 0 && is[1] == 0) {
				break;
			}
		}

	}

}