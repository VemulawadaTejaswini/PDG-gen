import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			if (!sc.hasNext()) {
				break;
			}
			double v = sc.nextDouble();
			int ret = 0;
			for (int i = 1;; i++) {
				ret = i;
				if (v > Math.sqrt(2 * 9.8 * (5 * i - 5))) {
					continue;
				}
				break;
			}
			System.out.println(ret);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}