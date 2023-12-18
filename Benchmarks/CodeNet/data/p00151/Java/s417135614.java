import java.io.IOException;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num = 0;

		while((num = parseNum()) != 0) {
			solve(num);
		}
	}

	private static void solve(int num) {
		int[][][]	map = new int[num+1][num+2][5];
		int			max = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				map[i][j][0] = parseDot();
				if (map[i][j][0] == 1) {
					map[i][j][1] = (map[i][j-1][0] == 1)?map[i][j-1][1]+1:1;		// left
					map[i][j][2] = (map[i-1][j-1][0] == 1)?map[i-1][j-1][2]+1:1;	// up+left
					map[i][j][3] = (map[i-1][j][0] == 1)?map[i-1][j][3]+1:1;		// up
					map[i][j][4] = (map[i-1][j+1][0] == 1)?map[i-1][j+1][4]+1:1;	// up+right
					max = Math.max(max, map[i][j][1]);
					max = Math.max(max, map[i][j][2]);
					max = Math.max(max, map[i][j][3]);
					max = Math.max(max, map[i][j][4]);
				}
			}
		}

		System.out.println(max);
	}

	private static int parseDot() {
		try {
			int	buf = 0;

			// 0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf >= '0' && buf <= '9') {
					return buf - '0';
				}
			}
		} catch (IOException e) {}
		return -1;
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if ((skp == 0 || buf == -1) && buf != '.') {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}