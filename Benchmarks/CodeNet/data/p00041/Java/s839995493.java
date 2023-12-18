
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] p;

	static int[] d;

	static int e[];

	static int a(int a, int b, int e) {
		switch (e) {
		case 0:
			return a + b;
		case 1:
			return a - b;
		case 2:
			return a * b;
		}
		return 0;
	}

	static String s(int e) {
		switch (e) {
		case 0:
			return " + ";
		case 1:
			return " - ";
		case 2:
			return " * ";
		}
		return "";
	}

	static int so(int depth) {
		if (depth == 4)
			return so2(0);
		for (int i = 0; i < 4; i++) {
			if (d[i] >= 0)
				continue;
			d[i] = depth;
			if (so(depth + 1) > 0)
				return 1;
			d[i] = -1;
		}
		return 0;
	}

	static int so2(int depth) {
		if (depth == 3)
			return ((calc() == 10 || calc2() == 10) ? 1 : 0);
		for (int i = 0; i < 3; i++) {
			e[depth] = i;
			if (so2(depth + 1) > 0)
				return 1;
		}
		return 0;
	}

	static int calc() {
		int[] t = new int[4];
		for (int i = 0; i < 4; i++)
			t[d[i]] = p[i];
		int s = t[0];
		for (int i = 0; i < 3; i++)
			s = a(s, t[i + 1], e[i]);
		return s;
	}

	static int calc2() {
		int[] t = new int[4];
		for (int i = 0; i < 4; i++)
			t[d[i]] = p[i];
		return a(a(t[0], t[1], e[0]), a(t[2], t[3], e[2]), e[1]);
	}

	static String str() {
		StringBuffer sb = new StringBuffer();
		int[] t = new int[4];
		for (int i = 0; i < 4; i++)
			t[d[i]] = p[i];
		sb.append("(((" + t[0]);
		for (int i = 0; i < 3; i++) {
			sb.append(s(e[i]) + t[i + 1] + ")");
		}
		return sb.toString();
	}

	static String str2() {
		int[] t = new int[4];
		for (int i = 0; i < 4; i++)
			t[d[i]] = p[i];
		return "(" + t[0] + s(e[0]) + t[1] + ")" + s(e[1]) + "(" + t[2] + s(e[2]) + t[3] + ")";
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		p = new int[4];
		d = new int[4];
		e = new int[3];
		while (sc.hasNextInt()) {
			for (int i = 0; i < 4; i++)
				p[i] = sc.nextInt();
			if (p[0] == 0 && p[1] == 0 && p[2] == 0 && p[3] == 0)
				break;
			Arrays.fill(d, -1);
			if (so(0) > 0) {
				if (calc2() == 10) {
					System.out.println(str2());
				} else {
					System.out.println(str());
				}
			} else {

				System.out.println(0);
			}
		}
	}
}