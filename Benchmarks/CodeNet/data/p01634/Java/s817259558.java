import java.util.Scanner;

public class Main {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		boolean ok = true;
		boolean checkA = false;
		boolean checkB = false;
		boolean checkC = false;
		if(in.length() < 6) ok = false;
		else {
			for(int i = 0; i < in.length(); i++) {
				if(in.charAt(i) >= '0' && in.charAt(i) <= '9') {
					checkA = true;
				}
				if(in.charAt(i) >= 'a' && in.charAt(i) <= 'z') {
					checkB = true;
				}
				if(in.charAt(i) >= 'A' && in.charAt(i) <= 'Z') {
					checkC = true;
				}
			}
		}
		if(ok && checkA && checkB && checkC) {
			System.out.println("VALID");
		}
		else {
			System.out.println("INVALID");
		}
	}
}
