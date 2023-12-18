import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char c = sc.next().charAt(0);
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}
}
