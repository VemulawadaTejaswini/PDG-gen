import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String p = sc.next();
		boolean b1 = false;
		
		for(int is = 0; is < s.length(); is++) {
			boolean b2 = true;
			for(int ip = 0; ip < p.length(); ip++) {
				b2 = b2 && (s.charAt((is+ip)%s.length())==p.charAt(ip));
			}
			b1 = b1 || b2;
		}
		
		if(b1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
