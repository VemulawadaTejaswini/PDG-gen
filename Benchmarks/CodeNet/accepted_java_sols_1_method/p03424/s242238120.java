import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s[] = new String[n];
		boolean b = false;
		
		for(int i = 0; i < n; i++) {
			s[i] = scan.next();
			if(s[i].equals("Y")) {
				b = true;
			}
		}
		if(b == true) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}
}