import java.util.Scanner;

public class Main {
	static double dp[][];
	static int X, Y, Z;
	static int V[];
	static int m_kinds[];
	static int m_values[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			X = sc.nextInt();
			Y = sc.nextInt();
			Z = sc.nextInt();
			if (X == 0)
				break;
			V = new int[X];
			for (int i = 0; i < X; i++) {
				V[i] = sc.nextInt();
			}
			m_kinds = new int[Y+1];
			m_values = new int[Y+1];
			for (int i = 0; i < Z; i++) {
				int n = sc.nextInt();
				m_kinds[n] = sc.nextInt(); 
				m_values[n] = sc.nextInt(); 
			}
			dp = new double[Y+1][5001];
			dp[0][0] = 1;
			System.out.println((int)DP());
		}		
	}

	private static double DP() {
		for (int i = 0; i < Y; i++) {
			for (int j = 0; j < 5001; j++) {
				if (dp[i][j] > 0) {
					for (int k = 0; k < X; k++) {
						int to = i + V[k];
						if (to > Y) to = Y;
						int money = j;
						switch (m_kinds[to]) {
						case 1:
							to += m_values[to];
							if (to > Y) to = Y;
							break;
						case 2:
							money += m_values[to];
							break;
						case 3:
							money -= m_values[to];
							if (money < 0 ) money = 0;
							break;
						}
						dp[to][money] += (dp[i][j] / X);
					}
				}
			}
		}
        double exp = 0;
        for (int i = 0; i < 5001; i++) {
            exp += (dp[Y][i] * i);
        }
        return exp;
	}
}