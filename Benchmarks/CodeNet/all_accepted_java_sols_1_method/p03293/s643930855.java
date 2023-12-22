import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		if(s.equals(t)) {
			System.out.println("Yes");
			return;
		}
		for(int i = 1; i < s.length(); i++) {
			String str = s.substring(0,s.length()-1);
			s = s.substring(s.length()-1)+str;
			if(s.equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}