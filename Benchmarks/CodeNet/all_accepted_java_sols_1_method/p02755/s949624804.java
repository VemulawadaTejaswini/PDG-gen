
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int al, ar, bl, br;
		double calc = a / 0.08;
		if(calc == (int) calc) {
			al = (int) calc;
		} else {
			al = (int) calc + 1;
		}
		calc = (a + 1) / 0.08;
		if(calc == (int) calc) {
			ar = (int) calc - 1;
		} else {
			ar = (int) calc;
		}
		calc = b / 0.1;
		if(calc == (int) calc) {
			bl = (int) calc;
		} else {
			bl = (int) calc + 1;
		}
		calc = (b + 1) / 0.1;
		if(calc == (int) calc) {
			br = (int) calc - 1;
		} else {
			br = (int) calc;
		}
		if(al > br || bl > ar) {
			System.out.println(-1);
		} else {
			int ans = 0;
			if(al <= bl) {
				ans = bl;
			} else {
				ans = al;
			}
			System.out.println(ans);
		}
	}

}
