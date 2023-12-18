import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = a + b;
		while(true) {
			if(23 < ans) {
				ans -= 24;
			}
			else {
				break;
			}
		}
		System.out.println(ans);
	}
}