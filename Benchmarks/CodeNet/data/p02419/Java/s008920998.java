import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String END_OF_TEXT = "END_OF_TEXT", WORD = sc.nextLine();
		int count = 0;
		while (sc.hasNext()) {
			String text = sc.next();
			if (text.equals(END_OF_TEXT)) break;
			if (text.equalsIgnoreCase(WORD)) count++;
		}
		sc.close();
		System.out.println(count);	
	}
}