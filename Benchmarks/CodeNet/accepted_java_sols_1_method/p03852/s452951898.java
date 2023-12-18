import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();

		System.out.println("aiueo".indexOf(c) == -1 ? "consonant" : "vowel");


		sc.close();

	}

}