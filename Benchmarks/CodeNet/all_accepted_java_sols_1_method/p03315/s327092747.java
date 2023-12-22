import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(str.length() - 2 * str.replace("+","").length());
		scn.close();
	}
}