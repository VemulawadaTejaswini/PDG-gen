import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		int maxLength = 0;
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'T' || s.charAt(i) == 'G') {
				counter++;
				maxLength=Math.max(maxLength, counter);
			} else {
				counter = 0;
			}
		}

		System.out.println(maxLength);

	}

}
