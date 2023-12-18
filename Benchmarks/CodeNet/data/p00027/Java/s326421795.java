import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while (true) {
			int m = in.nextInt();
			int d = in.nextInt();
			if(m == 0) break;
			String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
			System.out.println(weeks[zeller(2004, m, d)]);
		}
	}

	public static int zeller(int y, int m, int d) {
		if(m<3){m+=12;--y;}

		return ( y + y/4 - y/100 + y/400 + ( 13*m + 8 )/5 + d )%7;
	}
}