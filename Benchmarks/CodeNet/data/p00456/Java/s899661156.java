
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int w[] = new int[10];
		int k[] = new int[10];
		for(int i=0;i<10;i++) w[i] = sc.nextInt();
		for(int i=0;i<10;i++) k[i] = sc.nextInt();
		sort(w); sort(k);
		System.out.println( (w[7] + w[8] + w[9]) + " " + (k[7] + k[8] + k[9]) );
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}