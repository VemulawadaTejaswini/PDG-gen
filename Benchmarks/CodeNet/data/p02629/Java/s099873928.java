import java.util.Scanner;

// ABC171-C
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		String base26 = Long.toString(N, 26);

		System.out.println(convertToAlphabet(base26));
		sc.close();
	}

	private static char[] convertToAlphabet(String base26) {

		char[] charArray = base26.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isAlphabetic(charArray[i])) {
				charArray[i] += 10;
			} else {
				charArray[i] += 49;
			}
		}

		for (int i = 0; i < charArray.length; i++) {
			charArray[i]--;
		}

		return charArray;
	}

}
