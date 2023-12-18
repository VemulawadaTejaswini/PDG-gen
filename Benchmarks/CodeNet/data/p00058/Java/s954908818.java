import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0058/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aoj0058/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for (; sc.hasNext();) {
			double X[] = new double[4], Y[] = new double[4];
			for (int i = 0; i < 4; i++) {
				X[i] = sc.nextDouble();
				Y[i] = sc.nextDouble();
			}
			double dx1 = X[0] - X[1];
			double dy1 = Y[0] - Y[1];
			double dx2 = X[2] - X[3];
			double dy2 = Y[2] - Y[3];
			boolean res = (dx1 * dx2 + dy1 * dy2) < 1e-3;
			System.out.println(res ? "YES":"NO");
		}
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}