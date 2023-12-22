import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		String s = sc.next();
		String ans[] = {"Yes", "No"};
		sc.close();
		int an = 0;
		int n = s.length();
		for(int i = 0; i < a; ++i) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				an = 1;
				break;
			}
		}
		if(s.charAt(a) != '-')an = 1;
		if(an != 1) {
			for(int i = a + 1; i < n; ++i) {
				if(s.charAt(i) < '0' || s.charAt(i) > '9') {
					an = 1;
					break;
				}
			}
		}
		System.out.println(ans[an]);
	}
}
