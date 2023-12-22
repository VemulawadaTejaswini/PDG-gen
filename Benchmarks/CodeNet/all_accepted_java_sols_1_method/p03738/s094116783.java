import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1= sc.next();
		if (s.length()>s1.length()) {
			System.out.println("GREATER");
			return ;
		}
		if (s.length()<s1.length()) {
			System.out.println("LESS");
			return ;
		}
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)>s1.charAt(i)) {
				System.out.println("GREATER");
				return ;
			}
			if(s.charAt(i)<s1.charAt(i)) {
				System.out.println("LESS");
				return ;
			}
		}
		System.out.println("EQUAL");
		return ;
	}
}