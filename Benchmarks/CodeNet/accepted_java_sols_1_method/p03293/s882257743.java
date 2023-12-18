import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		if(s.equals(t)) {
			System.out.println("Yes");
			return;
		}
		for(int i = 0; i < s.length() + 1; i++) {
			s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
			if(s.equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
