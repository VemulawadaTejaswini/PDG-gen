import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str1 = in.nextLine().toCharArray();
		char[] str2 = in.nextLine().toCharArray();
		if (check(str1, str2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}

	private static boolean check(char[] str1, char[] str2) {
		for (int i = 0; i < str1.length; ++i) {
			char[] rotateStr = rotate(str2, i);
			if (compare(str1, rotateStr) == true) {
				return true;
			}
		}
		return false;
	}

	private static boolean compare(char[] str1, char[] str2) {
		for (int i = 0; i < str1.length; ++i) {
			if (str1[i] != str2[i]) {
				return false;
			}
		}
		return true;
	}

	private static char[] rotate(char[] str, int startIndex) {
		char[] result = new char[str.length];
		int index = 0;
		for (int i = startIndex; i < str.length; ++i) {
			result[index] = str[i];
			++index;
		}
		for (int i = 0; i < startIndex; ++i) {
			result[index] = str[i];
			++index;
		}
		return result;
	}

}