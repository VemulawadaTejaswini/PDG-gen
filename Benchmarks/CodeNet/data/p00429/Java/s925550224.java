
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			List<Integer> list = new ArrayList<Integer>();
			String str = scanner.next();
			for (int i = 0; i < str.length(); i++) {
				list.add(Character.getNumericValue(str.charAt(i)));
			}
			for (int i = 0; i < n; i++) {
				List<Integer> tmp = new ArrayList<Integer>();
				int count = 1;
				for (int j = 1; j < list.size(); j++) {
					if (list.get(j) == list.get(j - 1))
						count++;
					else {
						tmp.add(count);
						tmp.add(list.get(j - 1));
						count = 1;
					}
				}
				tmp.add(count);
				tmp.add(list.get(list.size() - 1));
				list = tmp;
			}
			for (int l : list)
				System.out.print(l);
			System.out.println();
		}
	}
}