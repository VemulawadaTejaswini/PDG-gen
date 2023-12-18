import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		String st;
		boolean first, second, third;
		int out, score;
		
		n = sc.nextInt();
		first = false;
		second = false;
		third = false;
		out = 0;
		score = 0;
		while (sc.hasNext()) {
			st = sc.next();
			if (st.equals("HIT")) {
				if (third) {
					score++;
				}
				third = second;
				second = first;
				first  =true;
			} else if (st.equals("HOMERUN")) {
				if (first) {
					score++;
					first = false;
				}
				if (second) {
					score++;
					second = false;
				}
				if (third) {
					score++;
					third = false;
				}
				score++;
			} else if (st.equals("OUT")) {
				out++;
				if (out == 3) {
					System.out.println(score);
					out = 0;
					score = 0;
					first = false;
					second = false;
					third = false;
				}
			}
		}
	}
}