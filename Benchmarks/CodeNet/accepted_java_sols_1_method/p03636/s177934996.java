import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int charcount = s.length() - 2;
		System.out.println(s.substring(0, 1) + charcount + s.substring(s.length() - 1,s.length()));
	}
}