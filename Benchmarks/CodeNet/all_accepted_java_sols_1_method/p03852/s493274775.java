import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String words = "aiueo";
		char a = sc.next().charAt(0);
		String answer = "consonant";
		if(words.indexOf(a) != -1) {
			answer = "vowel";
		}
		System.out.println(answer);
	}
}
