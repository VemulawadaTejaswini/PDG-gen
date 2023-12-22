import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		boolean check = Character.isUpperCase(s.charAt(0));
		if (check) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}

}
