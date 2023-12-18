import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
			solve(sc.nextInt());
	}
	void solve(int N) {
		boolean first = true;
		for (int k = 0; k < 10; k++)
			if ((N >> k & 1) == 1) {
				if (first)
					first = false;
				else
					System.out.print(' ');
				System.out.print(1 << k);
			}
		System.out.println();
	}
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}