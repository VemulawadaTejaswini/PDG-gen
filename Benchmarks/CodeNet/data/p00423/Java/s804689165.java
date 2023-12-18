import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int a = 0, b = 0;
			for (int i = 0; i < n; i++) {
				int ta = sc.nextInt(), tb = sc.nextInt();
				if (ta > tb)
					a += ta + tb;
				else if (ta < tb)
					b += ta + tb;
				else {
					a += ta;
					b += tb;
				}
			}
			out.printf("%d %d\n", a, b);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}