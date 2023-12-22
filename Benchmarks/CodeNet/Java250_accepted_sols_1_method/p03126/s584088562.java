import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		scanner.nextLine();
		List<Integer> alList = new ArrayList<>();
		for (int i = 1; i <= M; i++) {
			alList.add(i);
		}

		while (scanner.hasNextLine()) {
			scanner.nextInt();
			String string = scanner.nextLine();
			String[] s = string.split(" ");
			List<String> kIntegers = new ArrayList<>();
			for (String k : s) {
				kIntegers.add(k);
			}
			List<Integer> nothing = new ArrayList<>();
			for (int i = 1; i <= M; i++) {
				if (!kIntegers.contains(String.valueOf(i))) {
					nothing.add(i);
				}
			}

			alList.removeAll(nothing);
		}

		System.out.println(alList.size());
	}
}