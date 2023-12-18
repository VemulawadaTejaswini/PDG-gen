import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int[][] num = new int[4][13];
		char[][] suit = new char[4][13];
		while (true) {
			char trump = sc.next().charAt(0);
			if (trump == '#') break;
		
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 13; j++) {
					String s = sc.next();
					if (Character.isDigit(s.charAt(0))) {
						num[i][j] = Integer.parseInt(""+s.charAt(0));
					} else {
						switch(s.charAt(0)) {
						case 'T': num[i][j] = 10; break;
						case 'J': num[i][j] = 11; break;
						case 'Q': num[i][j] = 12; break;
						case 'K': num[i][j] = 13; break;
						case 'A': num[i][j] = 14; break;
						}
					}
					suit[i][j] = s.charAt(1);
				}
			}
			
			int winner = 0;
			int ns = 0, sw = 0;
			for (int i = 0; i < 13; i++) {
				int max = 0, tmax = 0;
				int win = -1, twin = -1;
				for (int j = 0; j < 4; j++) {
					if (suit[j][i] == suit[winner][i]) {
						if (max < num[j][i]) {
							max = num[j][i];
							win = j;
						}
					} else if (suit[j][i] == trump) {
						if (tmax < num[j][i]) {
							tmax = num[j][i];
							twin = j;
						}
					}
				}
				if (tmax > 0) {
					winner = twin;
					if (twin % 2 == 0) ns++;
					else sw++;
				} else {
					winner = win;
					if (win % 2 == 0) ns++;
					else sw++;
				}
			}
			if (ns > sw) {
				out.printf("NS %d\n", ns-6);
			} else {
				out.printf("EW %d\n", sw-6);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}