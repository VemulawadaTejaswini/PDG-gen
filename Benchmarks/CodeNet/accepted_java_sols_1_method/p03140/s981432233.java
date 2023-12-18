import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		
		int op = 0;
		
		for (int i = 0; i < n; i++) {
			final char chA = a.charAt(i);
			final char chB = b.charAt(i);
			final char chC = c.charAt(i);
			
			final boolean abMatch = chA == chB;
			final boolean acMatch = chA == chC;
			final boolean bcMatch = chB == chC;
			
			if (abMatch && acMatch) {
				// do nothing
			} else if (abMatch || acMatch || bcMatch) {
				op += 1;
			} else {
				op += 2;
			}
		}
		
		System.out.println(op);
	}

}