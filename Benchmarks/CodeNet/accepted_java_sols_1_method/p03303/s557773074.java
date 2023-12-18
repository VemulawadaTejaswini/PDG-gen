import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int w = sc.nextInt();

		String answer = "";
		for (int i = 0; i < s.length(); i = i + w) {
			answer = answer + String.valueOf(s.charAt(i));
		}

		System.out.println(answer);
	}
}