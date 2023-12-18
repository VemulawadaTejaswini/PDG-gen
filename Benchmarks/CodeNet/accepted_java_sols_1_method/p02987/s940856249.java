
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int first = 0;
		int second = 0;
		char firstChar = 0;
		char secondChar = 0;
		for(int i = 0 ; i < 4 ; i++) {
			char c = s.charAt(i);
			if(firstChar == 0) {
				firstChar = c;
				first++;
			} else if(c != firstChar && secondChar == 0) {
				secondChar = c;
				second++;
			} else if(c == firstChar) {
				first++;
			} else if(c == secondChar) {
				second++;
			}
		}
		if(first == 2 && second == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();

	}

}
