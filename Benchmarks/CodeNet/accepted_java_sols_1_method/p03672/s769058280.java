import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int len = s.length();
		int del;
		for (del = 1; del < len; del++) {
			if ((len - del) % 2 != 0) continue;
			
			String sub = s.substring(0, len - del);
			String l = sub.substring(0, sub.length() / 2);
			String r = sub.substring(sub.length() / 2);
			
			if (l.equals(r)) break;
		}
		
		System.out.println(len - del);
		
		sc.close();
	}
}


