import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<String>();

		while (true) {
			String line = sc.nextLine();
			String[] strings = line.split(" ");
			int x = Integer.parseInt(strings[0]);
			int y = Integer.parseInt(strings[1]);

			if (x > y) {
				System.out.println(y + " " + x);
			} else {
				System.out.println(x + " " + y);
			}

			if (x == 0 && y == 0) {
				break;
			}
			list.add(line);

		}
	}

}