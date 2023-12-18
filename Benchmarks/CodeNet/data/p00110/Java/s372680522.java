
import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0110/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aojxxxx/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (; sc.hasNext();) {
			String str = sc.next();
			str = str.replace('+', '=');
			String[] ss = str.split("=");
			int ans = -1;
			for (int x = 0; x < 10; x++) {
				String A = ss[0].replace('X', (char) ('0' + x));
				String B = ss[1].replace('X', (char) ('0' + x));
				String C = ss[2].replace('X', (char) ('0' + x));

				if (new BigInteger(A).add(new BigInteger(B)).equals(new BigInteger(C))) {
					if (A.length() >= 2 && A.charAt(0) == '0' ||
						B.length() >= 2 && B.charAt(0) == '0' || 
						C.length() >= 2 && C.charAt(0) == '0') {
					}
					else {
						ans = x;
					}
				}
			}
			if (ans == -1)
				System.out.println("NA");
			else
				System.out.println(ans);

		}
	}
}