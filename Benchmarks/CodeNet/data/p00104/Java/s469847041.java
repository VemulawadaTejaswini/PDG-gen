import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	char[][] table;
	public void run() {
		for(;;) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			if (R == 0) break;
			table = new char[R][C];
			for (int i = 0; i < R; i++) table[i] = sc.next().toCharArray();
			
			int r = 0, c = 0;
			
			int limit = R * C + 10;
			boolean end = false;
			int step = 0;
			for (; step < limit && !end; step++) {
				switch (table[r][c]) {
				case '>': { c++; }  break;
				case '<': { c--; }  break;
				case '^': { r--; }  break;
				case 'v': { r++; }  break;
				case '.': {end = true;} break;
				}
			}
			if (step >= limit) {
				System.out.println("LOOP");
			} else 
				System.out.println(c + " " + r);
			
		}
	}
}