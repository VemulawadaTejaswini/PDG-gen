
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			String buffer = sc.next();
			if (buffer.equals("0")) {
				break;
			}
			int p[] = new int[2];
			int v = 0;
			for (char ch : buffer.substring(1).toCharArray()) {
				v = ch - 'A';
				p[v]++;
			}
			if (p[0] > p[1]) {
				p[0]++;
			} else {
				p[1]++;
			}
			System.out.println(p[0] + " " + p[1]);
			buffer = sc.next();
			p = new int[2];
			for (char ch : buffer.substring(1).toCharArray()) {
				v = ch - 'A';
				p[v]++;
			}
			if (p[0] > p[1]) {
				p[0]++;
			} else {
				p[1]++;
			}

			System.out.println(p[0] + " " + p[1]);
			buffer = sc.next();
			p = new int[2];
			for (char ch : buffer.substring(1).toCharArray()) {
				v = ch - 'A';
				p[v]++;
			}
			if (p[0] > p[1]) {
				p[0]++;
			} else {
				p[1]++;
			}
			System.out.println(p[0] + " " + p[1]);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}