import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int ac = 0, wa = 0, tle = 0, re = 0;
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			if (s.equals("AC"))
				ac++;
			else if (s.equals("WA"))
				wa++;
			else if (s.equals("TLE"))
				tle++;
			else if (s.equals("RE"))
				re++;
		}
		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + re);
	}

}
