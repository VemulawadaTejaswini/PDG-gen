import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char temp='a';
		char[] s = sc.next().toCharArray();
		String ans = "Good";
		for (char c : s) {
			if(temp == c) ans = "Bad";
			temp = c;
		}
		System.out.println(ans);
	}
}
