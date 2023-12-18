
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int a = Integer.parseInt(s.substring(0,2));
		int b = Integer.parseInt(s.substring(2,4));
		boolean yymm = 1<=b && b<=12;
		boolean mmyy = 1<=a && a<=12;
		
		if (yymm) {
			if (mmyy) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("YYMM");
			}
		} else {
			if (mmyy) {
				System.out.println("MMYY");
			} else {
				System.out.println("NA");
			}
		}
	}
}
