import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10000; i++) {
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			if (line.equals("0")) {
				break;
			}
			list.add(line);
		}

		for (int j = 1; j < list.size(); j++) {
			String string = list.get(j-1);
			System.out.println("Case " + j + ": " + string);
		}

	}

}