import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = sc.nextInt();
		String ans = "";
		for(int i = 0 ;; i += a) {
			ans += s.charAt(i);
			if(i + a >= s.length()) break;
		}
		System.out.println(ans);
	}
}
