import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int trump;
	int[][] num = new int[4][13];
	int[][] mark = new int[4][13];
	int ns, ew;
	
	public void run() {
		while (true) {
			char x = in.next().charAt(0);
			if (x == '#') break;
			trump = (x == 'S') ? 3 :
				    (x == 'H') ? 2 :
				    (x == 'D') ? 1 : 0;
			ns = 0; ew = 0;
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					String s = in.next();
					char c = s.charAt(0);
					num[i][j] = (c == 'T') ? 10 : 
						  		(c == 'J') ? 11 :
						  		(c == 'Q') ? 12 :
						  		(c == 'K') ? 13 :
						  		(c == 'A') ? 14 : c - '0';
					c = s.charAt(1);
					mark[i][j] = (c == 'S') ? 3 :
								 (c == 'H') ? 2 :
								 (c == 'D') ? 1 : 0;
				}
			}
			
			int winner = 0;
			for (int i = 0; i < num[0].length; i++) {
				int field = mark[winner][i];
				for (int j = 0; j < num.length; j++) {
					if ((mark[winner][i] == trump && mark[j][i] != trump) ||
						(mark[j][i] != field && mark[j][i] != trump))
						continue;
					else if (mark[winner][i] != trump && mark[j][i] == trump)
						winner = j;
					else {
						if (num[winner][i] > num[j][i]) continue;
						else if (num[winner][i] < num[j][i]) winner = j;
					}
				}
				if (winner == 0 || winner == 2) {
					ns++;
				}
				else  {
					ew++;
				}
			}
			System.out.println((ns > ew) ? "NS " + (ns-6) : "EW " + (ew-6));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}