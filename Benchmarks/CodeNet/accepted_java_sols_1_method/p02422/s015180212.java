import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String s = sc.next();
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			String mode = sc.next();
			int a = sc.nextInt(); int b = sc.nextInt();
			if (mode.equals("print")) {
				System.out.println(s.substring(a,b+1));
			}
			else if (mode.equals("reverse")) {
				s = s.substring(0,a) + (new StringBuilder(s.substring(a,b+1)).reverse().toString()) + (s.substring(b+1,s.length()));
			}
			else if (mode.equals("replace")) {
				String t = sc.next();
				s = s.substring(0,a) + t + s.substring(b+1,s.length());
			}
		}
		
	}
}
