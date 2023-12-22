import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] card = new int[4][13];
		for (int i = 0; i < n; ++i) {
			String suite = in.next();
			int number = in.nextInt() - 1;
			int s = 0;
			if ("S".equals(suite)) s = 0;
			if ("H".equals(suite)) s = 1;
			if ("C".equals(suite)) s = 2;
			if ("D".equals(suite)) s = 3;
			card[s][number] = 1;
		}
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 13; ++j) {
				if (card[i][j] == 0) {
					String s = "";
					if (i == 0) s = "S";
					if (i == 1) s = "H";
					if (i == 2) s = "C";
					if (i == 3) s = "D";
					System.out.println(s + " " + (j + 1));
				}
			}
		}
	}
}