import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		int n = s.length();
		int n1 = s1.length();
		if(n != n1) {
			System.out.println("NO");
			return;
		}
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) != s1.charAt(n1 - 1 - i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
