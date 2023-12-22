import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.next().split("");
		if(s[2].equals(s[3]) && s[4].equals(s[5])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}