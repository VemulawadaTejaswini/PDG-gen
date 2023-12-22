import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		int ans = 0;
		int x = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		for(int i = 0; i < n; i++) {
			if('I' == s.charAt(i)) {
				x += 1;
			}else if('D' == s.charAt(i)){
				x -= 1;
			}
			ans = Math.max(x, ans);
		}
		System.out.println(ans);
	}
}
