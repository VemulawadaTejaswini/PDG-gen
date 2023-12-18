import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int left = Integer.valueOf(str.substring(0, 2));
		int right = Integer.valueOf(str.substring(2));
		
		String ans = "NA";
		if ((left >= 1 && left <= 12) && (right >= 1 && right <= 12)) {
			ans = "AMBIGUOUS";
		} else if (left >= 1 && left <= 12) {
			ans = "MMYY";
		} else if (right >= 1 && right <= 12) {
			ans = "YYMM";
		}
		
		System.out.println(ans);
	}
}