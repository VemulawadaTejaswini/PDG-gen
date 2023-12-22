
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Integer.parseInt(s.substring(0, 2));
		int b = Integer.parseInt(s.substring(2));
		
		String ans = "NA";
		if ((a >= 1 && a<= 12) && (b >= 1 && b<= 12)) {
			ans = "AMBIGUOUS";
		} else if (a >= 1 && a<= 12) {
			ans = "MMYY";
		} else if (b >= 1 && b<= 12) {
			ans = "YYMM";
		} 
		System.out.println(ans);
	}
}