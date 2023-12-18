import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int day = 0;
		int daymax = 0;
		for (int d=0;d < S.length() ;d++ ) {
			if (S.charAt(d) == 'R') {
				day++;
			} else {
				day = 0;
			}
			daymax = Math.max(daymax,day);
		}
		System.out.println(daymax);
	}

}
