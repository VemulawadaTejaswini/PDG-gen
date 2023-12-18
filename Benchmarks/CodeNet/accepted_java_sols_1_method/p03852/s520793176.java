import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		
		if (c == 'a' | c == 'i' | c == 'u' | c == 'e' | c == 'o') {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}
}