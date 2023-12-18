import java.util.Scanner;

public class Solve {
	
	private static boolean debug = false;
	
	private static int r;
	private static int c;
	
	private static int[][] senbeis;
	
	private static int URA = 0, OMOTE = 1; 
	
	@SuppressWarnings("unused")
	private static void debug(String format, Object... objects) {
		if (!debug)
			return;
		System.out.format(format, objects);
	}
	
	public static int solve() {
		int ans = 0;
		for (int trial = 0; trial < (2 << 10); trial++) {
			int canSell = 0;
			for (int x = 0; x < c; x++) {
				int ura = 0;
				for (int y = 0; y < r; y++) {
					boolean reverses = ((y >> trial) & 1) == 0;
					int target = reverses ? URA : OMOTE;
					ura += (senbeis[y][x] == target) ? 1 : 0;
				}
				canSell += Math.max(ura, r - ura);
			}
			ans = Math.max(ans, canSell);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		c = scanner.nextInt();
		senbeis = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				senbeis[i][j] = scanner.nextInt();
			}
		}
		debug("===\n");
		debug("%d %d\n", r, c);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				debug("%d ", senbeis[i][j]);
			}
			debug("\n");
		}
		debug("===\n");
		System.out.format("%d\n", solve());
		scanner.close();
	}
}