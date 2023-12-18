import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		Map<Character, Integer> nameMap = new HashMap<>();
		for (int i = 0; i < inN; i++) {
			char first = stdin.next().charAt(0);
			int count = nameMap.getOrDefault(first, 0) + 1;
			nameMap.put(first, count);
		}

		char[][] firstArray = {
			{
				'M', 'A', 'R'
			}, {
				'M', 'A', 'C'
			}, {
				'M', 'A', 'H'
			}, {
				'M', 'R', 'C'
			}, {
				'M', 'R', 'H'
			}, {
				'M', 'C', 'H'
			}, {
				'A', 'R', 'C'
			}, {
				'A', 'R', 'H'
			}, {
				'A', 'C', 'H'
			}, {
				'R', 'C', 'H'
			}
		};

		long count = 0;
		for (char[] array : firstArray) {
			long pattern = 1;
			for (char first : array) {
				if (nameMap.containsKey(first)) {
					pattern *= nameMap.get(first);
				}
				else {
					pattern = 0;
					break;
				}
			}
			count += pattern;
		}

		System.out.println(count);
	}
}
