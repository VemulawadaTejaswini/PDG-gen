import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);

		String ans;

		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			ans = "vowel";
			break;
		default:
			ans = "consonant";
			break;
		}

		System.out.println(ans);
		sc.close();
	}

}
