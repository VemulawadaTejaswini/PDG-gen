import static java.util.Arrays.deepToString;
import static java.util.Arrays.fill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			char[][] t = new char[8][8];
			for (int i = 0; i < 8; i++) t[i] = sc.next().toCharArray();
			
			t = rot(t);
			System.out.println(90);
			print(t);
			t = rot(t);
			System.out.println(180);
			print(t);
			t = rot(t);
			System.out.println(270);
			print(t);
			
		}
	}
	void print(char[][] t) {
		for (int i = 0; i < t.length; i++) System.out.println(new String(t[i]));
	}
	char[][] rot(char[][] t) {
		char[][] res = new char[t[0].length][t.length];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				res[j][t.length - 1 - i] = t[i][j];
			}
		}
		return res;
	}
}