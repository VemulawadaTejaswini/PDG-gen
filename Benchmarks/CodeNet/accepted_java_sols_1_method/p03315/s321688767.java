import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String inputStr = scanner.nextLine();
		char[] array = inputStr.toCharArray();
		int result = 0;
		for (char input : array) {
			if (input == '+') {
			    result++;
			} else {
			    result--;
			}
		}
		System.out.print(result);
	}
}