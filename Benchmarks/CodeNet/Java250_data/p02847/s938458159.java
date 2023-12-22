import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();

		sc.close();

		Map<String, Integer> m = new HashMap<>();
		m.put("SUN", 7);
		m.put("MON", 6);
		m.put("TUE", 5);
		m.put("WED", 4);
		m.put("THU", 3);
		m.put("FRI", 2);
		m.put("SAT", 1);

		out.println(m.get(S));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
