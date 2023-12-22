import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		if(str.length() == 2) {
			System.out.println(str);
		}else {
			System.out.print(str.charAt(2));
			System.out.print(str.charAt(1));
			System.out.println(str.charAt(0));
		}
	}
}
