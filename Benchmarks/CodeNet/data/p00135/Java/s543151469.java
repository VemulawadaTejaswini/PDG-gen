import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s[]  =sc.next().split(":");
			double hour, minute;
			hour = 360.0 * Double.valueOf(s[0]) / 12 + 30.0 * Double.valueOf(s[1]) / 60;
			minute = 360.0 * Double.valueOf(s[1]) / 60;
			
			double diff = Math.abs(minute - hour);
			if (180.0 < diff) {
				diff = 360.0 - diff;
			}
			if (0.0 <= diff && diff < 30.0) {
				System.out.println("alert");
			} else if (90.0 <= diff && diff <= 180.0) {
				System.out.println("safe");
			} else {
				System.out.println("warning");
			}
		}
	}
}