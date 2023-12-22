import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String HIT = "HIT", HOMERUN = "HOMERUN", OUT = "OUT";
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int out, point, rui;
		String j;
		for (int i = 0; i < n; i++) {
			out = 0;
			point = 0;
			rui = 0;
			while (out < 3) {
				j = in.next();
				if (OUT.equals(j)) {
					out++;
				} else if (HIT.equals(j)) {
					rui++;
					if (rui > 3) {
						rui = 3;
						point++;
					}
				} else if (HOMERUN.equals(j)) {
					point += rui + 1;
					rui = 0;
				}
			}
			System.out.println(point);
		}
	}
}