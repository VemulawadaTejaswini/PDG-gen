import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true) {
			String s = sc.next();
			if (s.equals("-")) break;
			int n = sc.nextInt();
			for (int i=0; i<n; i++) {
				int pos = sc.nextInt();
				s = s.substring(pos,s.length()) + s.substring(0,pos);
			}
			System.out.println(s);
		}
		
	}
}
