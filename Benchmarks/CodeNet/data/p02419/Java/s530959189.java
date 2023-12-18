import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();

		ArrayList<String> T = new ArrayList<String>();
		String[] input;
		while (EndDecision(input = sc.nextLine().split("[\\s]+"))) {
			for (String str : input) {
				T.add(str.toLowerCase());
			}
		}

		int count = 0;
		for (String str : T) {
			if (W.equals(str)) {
				count++;
			}
		}

		System.out.println(count);

	}

	public static boolean EndDecision(String[] array) {
		if (array[0].equals("END_OF_TEXT")) {
			return false;
		} else {
			return true;
		}

	}

}

