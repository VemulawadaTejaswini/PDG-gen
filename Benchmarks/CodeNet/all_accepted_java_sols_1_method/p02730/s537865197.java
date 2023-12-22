import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String s = scan.next();
		int a = (s.length() -1)/2;
		int b = (s.length()+3)/2-1;
		String fString = s.substring(0 , a);
		String lString = s.substring(b, s.length());

		if(fString.equals(lString)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}