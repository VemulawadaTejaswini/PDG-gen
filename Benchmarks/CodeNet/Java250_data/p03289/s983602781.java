import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean possible = true;

		if (!(s.charAt(0) == 'A')) {
			possible = false;
		} else if (s.substring(2, s.length() - 1).indexOf("C") == -1) {
			possible = false;
		} else {
			String tmpS =  s.substring(1, s.substring(2, s.length() - 1).indexOf("C") + 2) + s.substring(s.substring(2, s.length() - 1).indexOf("C") + 3);
			if (!tmpS.toUpperCase().toLowerCase().equals(tmpS)) possible = false;
		}
		if (possible) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}
}
