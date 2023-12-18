import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String s2 = sc.next();
		
		if(s.equals(s2.substring(0, s.length()))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}