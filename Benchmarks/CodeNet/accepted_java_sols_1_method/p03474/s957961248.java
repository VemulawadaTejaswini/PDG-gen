import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String ans = "Yes";
		if(a+b+1 != s.length()) {
			ans = "No";
		}
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(a)!='-') {
				ans = "No";
			}
			if((i<a||i>=a+1)&&s.charAt(i)=='-') {
				ans = "No";
			}
		}
		System.out.println(ans);
	}
}