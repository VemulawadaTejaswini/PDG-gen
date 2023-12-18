package question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		if (args.length != 0) {
			checkConstraints(args);
		}
		List<String> asList = Arrays.asList(args);
		Collections.reverse(asList);
		for (int i = 0; i < 3; i++) {
			System.out.println(asList.get(i));
		}
	}

	private static void checkConstraints(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) < 0 || Integer.parseInt(args[i]) > 10000) {
				throw new IllegalArgumentException();
			}
		}
	}
}