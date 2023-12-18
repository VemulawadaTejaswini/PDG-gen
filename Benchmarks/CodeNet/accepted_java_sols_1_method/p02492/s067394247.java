import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x, y, ans;
		String s;
		x = scanner.nextInt();
		s = scanner.next();
		y = scanner.nextInt();
		while(!s.equals("?")) {
			if(s.equals("+")) ans = x+y;
			else if(s.equals("-")) ans = x-y;
			else if(s.equals("*")) ans = x*y;
			else if(s.equals("/")) ans = x/y;
			else ans = 0;
			System.out.println(ans);
			x = scanner.nextInt();
			s = scanner.next();
			y = scanner.nextInt();
		}
		scanner.close();
	}
}