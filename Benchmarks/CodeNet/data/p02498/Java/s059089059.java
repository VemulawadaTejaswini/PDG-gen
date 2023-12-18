import java.util.Scanner;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mojiretu;
		int i;
		char s;
		mojiretu = sc.nextLine();
		for (i = 0; i < mojiretu.length(); i++) {
			s = mojiretu.charAt(i);
			if (Character.isLowerCase(s))
				s = Character.toUpperCase(s);
			else if (Character.isUpperCase(s))
				s = Character.toLowerCase(s);
			System.out.print(s);
		}
		System.out.println();
	}
}