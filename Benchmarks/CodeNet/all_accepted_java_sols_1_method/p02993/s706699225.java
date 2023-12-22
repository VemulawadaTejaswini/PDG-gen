import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char temp='a';
		char[] s = sc.next().toCharArray();
		for (char c : s) {
			if(temp == c) {
				System.out.println("Bad");
				return;
			}
			temp = c;
		}
		System.out.println("Good");
	}
}
