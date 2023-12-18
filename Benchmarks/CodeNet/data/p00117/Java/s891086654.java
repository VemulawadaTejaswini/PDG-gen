import java.util.Scanner;

public class Main {

	static short[][] cost;
	static short[] d;
	static final short INF = Short.MAX_VALUE/4;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		byte n = scan.nextByte();
		cost = new short[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				cost[i][j] = INF;
			}
		}
		d = new short[n];
		short m = scan.nextShort();
		for (int i = 0; i < m; i++) {
			String[] line = scan.next().split(",");
			cost[Integer.parseInt(line[0])-1][Integer.parseInt(line[1])-1] = Short.parseShort(line[2]);
			cost[Integer.parseInt(line[1])-1][Integer.parseInt(line[0])-1] = Short.parseShort(line[3]);
		}
		String[] line = scan.next().split(",");
		byte[] s = new byte[]{(byte)(Integer.parseInt(line[0])-1),(byte)(Integer.parseInt(line[1])-1)};
		int money = Integer.parseInt(line[2])-Integer.parseInt(line[3]);

		for (int j = 0; j < 2; j++) {
			boolean[] used = new boolean[n];
			for (int i = 0; i < n; i++) d[i] = INF;
			d[s[j]] = 0;
			while (true) {
				byte v = -1;
				for (byte i = 0; i < n; i++) {
					if (!used[i] && (v == -1 || d[i] < d[v]))
						v = i;
				}
				if (v == -1)
					break;
				used[v] = true;
				for (byte i = 0; i < n; i++) {
					d[i] = (short) Math.min(d[i], d[v] + cost[v][i]);
				}
			}

			money-=d[s[1-j]];
		}

		System.out.println(money);
	}
}