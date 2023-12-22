import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] initialString = scanner.nextLine().toCharArray();

		int numLeft1 = 0;
		char leftMostNot1Char = '1';
		for(int i = 0; i < initialString.length; i++) {
			if (initialString[i] == '1') numLeft1++;
			else {
				leftMostNot1Char = initialString[i];
				break;
			}
		}

		if(Long.parseLong(scanner.nextLine()) <= numLeft1) System.out.println('1');
		else System.out.println(leftMostNot1Char);
	}
}
