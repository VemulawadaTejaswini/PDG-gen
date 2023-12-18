import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char temp = 'a';
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if (temp == ',' || temp == '.' || temp == ' ') {
				System.out.print(temp);
			} else if (Character.isUpperCase(temp)) {
				System.out.print(Character.toLowerCase(temp));
			} else if (Character.isLowerCase(temp)) {
				System.out.print(Character.toUpperCase(temp));
			}
		}
	}
}
