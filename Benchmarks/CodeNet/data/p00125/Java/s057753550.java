import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
 
public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		Calendar[]	date  = null;

		while ((date = parseDate()) != null) {
			long	diff = date[1].getTimeInMillis() - date[0].getTimeInMillis();
			System.out.println(diff / (1000 * 60 * 60 * 24));
		}
	}

	private static Calendar[] parseDate() {
		Calendar[]	date  = null;
		String		stdin = parseStdin();

		if (stdin != null) {
			if (!stdin.contains("-")) {
				String[]	lines = stdin.split(" ");

				date    = new Calendar[2];
				date[0] = Calendar.getInstance();
				date[1] = Calendar.getInstance();
				date[0].set(Integer.parseInt(lines[0]), Integer.parseInt(lines[1]), Integer.parseInt(lines[2]));
				date[1].set(Integer.parseInt(lines[3]), Integer.parseInt(lines[4]), Integer.parseInt(lines[5]));
			}
		}

		return date;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}