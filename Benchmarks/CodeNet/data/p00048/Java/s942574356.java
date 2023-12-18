import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0048/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aoj0048/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for (double d; sc.hasNext();) {
			d = sc.nextDouble();
			String str;
			if (d <= 48.0)
				str = "light fly";
			else if (d <= 51.00)
				str = "fly";
			else if (d <= 54.00)
				str = "bantam";
			else if (d <= 57.00)
				str = "feather";
			else if (d <= 60.00)
				str = "light";
			else if (d <= 64.00)
				str = "light welter";
			else if (d <= 69)
				str = "welter";
			else if (d <= 75)
				str = "light middle";
			else if (d <= 81)
				str = "middle";
			else if (d <= 91)
				str = "light heavy";
			else
				str = "heavy";
			System.out.println(str);
		}
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}