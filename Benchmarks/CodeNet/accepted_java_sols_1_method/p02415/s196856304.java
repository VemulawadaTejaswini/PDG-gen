import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] sen = input.toCharArray();

		for (int i = 0; i < sen.length; i++) {
			if (Character.isUpperCase(sen[i])) {
				sen[i] = Character.toLowerCase(sen[i]);
			} else {
				sen[i] = Character.toUpperCase(sen[i]);
			}
		}
		String output = String.valueOf(sen);
		System.out.println(output);
	}
}
