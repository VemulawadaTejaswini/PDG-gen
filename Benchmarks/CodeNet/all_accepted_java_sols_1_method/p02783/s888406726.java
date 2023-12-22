import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int h = sc.nextInt();
		int a = sc.nextInt();
		int ans =0;
		boolean con = true;
		while (con) {
			ans ++;
			h -= a;
			if (h<=0) {
				con =false;
			}
		}
		System.out.println(ans);
//------------------------------------------------------------
	}
}