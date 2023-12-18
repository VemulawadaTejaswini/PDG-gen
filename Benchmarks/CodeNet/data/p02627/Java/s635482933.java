import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		change(a);
	}

	private static void change(String a) {
		if(Character.isUpperCase(a.charAt(0))) {
			System.out.println(a.toLowerCase());
		}else {
			System.out.println(a.toUpperCase());
		}
	}
}