import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		int N = Integer.parseInt(line);
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

		long answer = 0;

		for (int i = 0; i < N; i++) {
			String[] readlines = scanner.nextLine().split("");
			Arrays.sort(readlines);

			String lines = "";
			for (int j = 0; j < readlines.length; j++)
				lines = lines + readlines[j];

			if (hashmap.containsKey(lines)) {
				answer = answer + hashmap.get(lines);
				hashmap.replace(lines, hashmap.get(lines) + 1);
			} else {
				hashmap.put(lines, 1);
			}
		}

		System.out.println(answer);
	}
}
