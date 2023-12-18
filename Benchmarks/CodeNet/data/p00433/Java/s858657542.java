
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int S = 0;
		int T = 0;
		for(int i=0;i<4;i++) S += sc.nextInt();
		for(int i=0;i<4;i++) T += sc.nextInt();
		System.out.println(max(S, T));
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}