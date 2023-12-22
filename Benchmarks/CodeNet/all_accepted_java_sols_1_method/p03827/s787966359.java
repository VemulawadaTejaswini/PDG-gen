import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		int x = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		for(int i = 0; i < n; i++) {
			if('I' == s.charAt(i)) {
				y += 1;
			}else if('D' == s.charAt(i)){
				y -= 1;
			}
			x = Math.max(y, x);
		}
		System.out.println(x);
	}
}