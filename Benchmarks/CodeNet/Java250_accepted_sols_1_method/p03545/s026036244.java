
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		int A = Integer.parseInt(N.substring(0, 1));
		int B = Integer.parseInt(N.substring(1, 2));
		int C = Integer.parseInt(N.substring(2, 3));
		int D = Integer.parseInt(N.substring(3, 4));
		
		if(A + B + C + D == 7) {
			System.out.println(A + "+" + B + "+" + C + "+" + D + "=7");
		} else if(A + B + C - D == 7) {
			System.out.println(A + "+" + B + "+" + C + "-" + D + "=7");
		} else if(A + B - C + D == 7) {
			System.out.println(A + "+" + B + "-" + C + "+" + D + "=7");
		} else if(A + B - C - D == 7) {
			System.out.println(A + "+" + B + "-" + C + "-" + D + "=7");
		} else if(A - B + C + D == 7) {
			System.out.println(A + "-" + B + "+" + C + "+" + D + "=7");
		} else if(A - B + C - D == 7) {
			System.out.println(A + "-" + B + "+" + C + "-" + D + "=7");
		} else if(A - B - C + D == 7) {
			System.out.println(A + "-" + B + "-" + C + "+" + D + "=7");
		} else if(A - B - C - D == 7) {
			System.out.println(A + "-" + B + "-" + C + "-" + D + "=7");
		}
		scan.close();

	}

}
