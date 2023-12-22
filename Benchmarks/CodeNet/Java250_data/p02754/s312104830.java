import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		println(n / (a + b) * a + Math.min(n % (a + b), a));
	}
}
