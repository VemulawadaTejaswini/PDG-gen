import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<String>();
		while (true) {
			String line = sc.nextLine();
			if (line.equals("0")) {
				break;
			}
			list.add(line);
		}

		int i = 1;
		for (String line : list) {
			int x = Integer.parseInt(line);
			System.out.println("Case " + i + ": " + x);
			i++;
		}

	}
}