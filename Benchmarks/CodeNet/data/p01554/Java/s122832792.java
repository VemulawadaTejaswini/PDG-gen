import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, m;
		n = Integer.parseInt(sc.nextLine());
		Set<String> id = new HashSet<String>();
		for (int i = 0; i < n; i++)
			id.add(sc.nextLine());
		m = Integer.parseInt(sc.nextLine());
		boolean state = false;
		for (int i = 0; i < m; i++) {
			String s = sc.nextLine();
			if (!id.contains(s)) {
				out.printf("Unknown %s\n", s);
			} else {
				if (state)
					out.printf("Closed by %s\n", s);
				else
					out.printf("Opened by %s\n", s);
				state = !state;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}