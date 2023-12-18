import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch) == true) {
				ch = Character.toUpperCase(ch);
			} else if(Character.isUpperCase(ch) == true) {
				ch = Character.toLowerCase(ch);
			}
			System.out.print(ch);
		}
		System.out.println("");
	}
}