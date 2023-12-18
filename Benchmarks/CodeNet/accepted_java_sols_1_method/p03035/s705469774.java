import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		int ans = 0;

		if(a>= 13) {
			ans = b;
		}else if(a<= 12 && a>=6) {
			ans = b/2;
		}else {
			ans = 0;
		}
		System.out.println(ans);
	}
}
