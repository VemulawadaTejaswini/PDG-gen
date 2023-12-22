import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.equals("H")) {
			if(s2.equals("H")) {
				System.out.println("H");
			} else {
				System.out.println("D");
			}
		} else {
			if(s2.equals("H")) {
				System.out.println("D");
			} else {
				System.out.println("H");
			}
		}
	}
}
