import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	private static final String UNKNOWN = "Unknown ";
	private static final String OPEND_BY = "Opened by ";
	private static final String CLOSED_BY = "Closed by ";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			set.add(in.next());
		}
		int m = in.nextInt();
		boolean opend = false;
		for (int i = 0; i < m; i++) {
			String message;
			String id = in.next();
			if (set.contains(id)) {
				message = (opend) ? CLOSED_BY : OPEND_BY;
				opend = !opend;
			} else {
				message = UNKNOWN;
			}
			System.out.print(message);
			System.out.println(id);
		}
		in.close();
	}
}