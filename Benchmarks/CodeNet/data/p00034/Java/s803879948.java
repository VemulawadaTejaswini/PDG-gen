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

		int rect = 0, diamond = 0;
		while (sc.hasNext()) {
			String[] ss = sc.next().split(",");
			int[] a = new int[10];
			for (int i = 0; i < 10; i++)
				a[i] = Integer.parseInt(ss[i]);
			int v1 = Integer.parseInt(ss[10]);
			int v2 = Integer.parseInt(ss[11]);
			System.out.println(solve(a, v1, v2));
		}
	}

	int solve(int[] a, int v1, int v2) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) sum += a[i];
		double t = (double) sum / (v1 + v2);
		double meet = v1 * t;
		int ans = 0;
		int acc = 0;
		for(int i = 0; i < 10; i++) {
			acc += a[i];
			if( acc + 0.000001 >= meet )
				return i + 1;
		}
		return 10;
	}
}