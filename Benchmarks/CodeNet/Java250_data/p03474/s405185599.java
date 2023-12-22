import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();

		String ans = "Yes";
		for(int i = 0; i < a + b; i++) {
			char ch = s.charAt(i);

			if(i == a && ch != '-') {
				ans = "No";
				break;
			} else if( i != a &&  !('0' <= ch && ch <= '9') ) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}