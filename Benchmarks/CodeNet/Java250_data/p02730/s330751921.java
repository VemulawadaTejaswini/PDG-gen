import java.util.*;

class Main {
  public static void main (String[] args) throws java.lang.Exception {
    Scanner scanner = new Scanner(System.in);
    String argument = scanner.next();
    boolean result = ATCoder_abc159_b.isStrongPalindrome(argument);
    System.out.printf("%s\n", result ? "Yes" : "No");
  }
}

class ATCoder_abc159_b {
	public static boolean isStrongPalindrome(String argument) {
		char[] argumentChars = argument.toCharArray();
		int halfwayLength = (argumentChars.length-1 ) / 2;
		int fullLength = argumentChars.length;
		for (int pos=0; pos < halfwayLength; ++pos) {
			// String must be a palindrome
			if (argumentChars[pos] != argumentChars[fullLength-pos-1]) {
				return false;
			}
			// First 'half' of string must be a palindrome
			if (argumentChars[pos] != argumentChars[halfwayLength-pos-1]) {
				return false;
			}
		}
		return true;
	}
}
