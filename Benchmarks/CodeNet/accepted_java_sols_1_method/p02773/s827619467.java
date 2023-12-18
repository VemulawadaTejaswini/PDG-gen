import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] strings = new String[N];
		for (int i = 0; i < N; i++) {
			strings[i] = scanner.next();
		}
		Arrays.parallelSort(strings);

		ArrayList<String> resultStrings = new ArrayList<String>();

		String tempString = "";
		int max = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {
			if (strings[i].equals(tempString)) {
				count++;
			} else {
				count = 0;
				tempString = strings[i];
			}
			if (count == max) {
				resultStrings.add(tempString);
			} else if (count > max) {
				max = count;
				resultStrings.clear();
				resultStrings.add(tempString);
			}
		}
		resultStrings.forEach(s -> System.out.println(s));

	}

}
