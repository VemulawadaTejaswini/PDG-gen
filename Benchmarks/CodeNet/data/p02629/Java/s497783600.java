import java.util.Scanner;

// ABC171-B
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String base26 = Integer.toString(N, 26);

		System.out.println(convertToAlphabet(base26));
		sc.close();
	}

	private static char[] convertToAlphabet(String base26) {

		char[] charArray = base26.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isAlphabetic(charArray[i])) {
				charArray[i] += 9;
			} else {
				charArray[i] += 48;
			}
		}

		return charArray;
	}

}
