
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			if (s.charAt(0) == '.')
				break;
			solve(s);
		}
	}

	public void solve(String s) {
		int res = 0;
		for (int p = 0; p <= 2; p++) {
			for (int q = 0; q <= 2; q++) {
				for (int r = 0; r <= 2; r++) {
					cur = 0;
					fomula = s.replaceAll("P", p + "")
							.replaceAll("Q", q + "").replaceAll("R", r + "");
					int v = scan();
					if (v == 2){
//						System.out.println(fomula);
						res++;
					}
				}
			}
		}
		System.out.println(res);
	}

	String fomula;
	int cur = 0;

	private int scan() {
		int v = -1;
		char c = next();
		switch (c) {
		case '0':
		case '1':
		case '2':
			v = c - '0';
			break;

		case '-':
			v = 2 - scan();
			break;
		
		case '(':
			v = op();
			break;
		}

		return v;

	}

	private int op() {
		int v = scan();
		char c = next();
		switch(c){
		case '+':
			v = Math.max(v, scan());
			break;
			
		case '*':
			v = Math.min(v, scan());
			break;
		}
		next();
		return v;
	}

	private char next() {
		char c = fomula.charAt(cur);
		cur++;
		return c;
	}
}