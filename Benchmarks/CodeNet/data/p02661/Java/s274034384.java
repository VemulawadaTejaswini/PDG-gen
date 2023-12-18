// practice with kaiboy, coached by rainboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int[] aa = new int[n];
		int[] bb = new int[n];
		for (int i = 0; i < n; i++) {
			aa[i] = sc.nextInt();
			bb[i] = sc.nextInt();
		}
		aa = Arrays.stream(aa).boxed().sorted().mapToInt($->$).toArray();
		bb = Arrays.stream(bb).boxed().sorted().mapToInt($->$).toArray();
		int a, b;
		if (n % 2 == 1) {
			a = aa[n / 2];
			b = bb[n / 2];
		} else {
			a = aa[n / 2 - 1] + aa[n / 2];
			b = bb[n / 2 - 1] + bb[n / 2];
		}
		println(b - a + 1);
	}
}
