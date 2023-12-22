import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		char[] cs = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			cs[i] = s.charAt(i);
		}
		boolean f = false;
		for (int i = 0; i < s.length(); i++) {
			String u = new String(cs);
			if (t.equals(u)) {
				f = true;
			}
			char a = cs[s.length()-1];
          	char[] cu = new char[s.length()];
			for (int j = 0; j < s.length()-1; j++) {
				cu[j+1] = cs[j]; 
			}
			cu[0] = a;
			cs = cu;
		}
		if (f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
