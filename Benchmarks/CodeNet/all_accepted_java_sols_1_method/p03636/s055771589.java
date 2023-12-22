import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
//------------------------------------------------------------

		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String start = String.valueOf(s.charAt(0));
		String end = String.valueOf(s.charAt(s.length()-1));
		String abbreviation = String.valueOf(s.length()-2);
		System.out.println(start+abbreviation+end);
//------------------------------------------------------------
	}
}