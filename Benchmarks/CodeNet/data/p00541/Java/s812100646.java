import java.util.Scanner;

public class Main {

	private static int[][] leftupper;
	private static int[][] rightlower;
	private static int H, W, L, P;

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
		W = scan.nextInt();
		L = scan.nextInt();
		P = scan.nextInt();

		leftupper = new int[W][H];
		rightlower = new int[W][H];

		for (int x = 0; x < W; x++)
			for (int y = 0; y < H; y++) {
				leftupper[x][y] = 0;
				rightlower[x][y] = 0;
			}
		for (int i = 0; i < P; i++) {
			int y = scan.nextInt() - 1;
			int x = scan.nextInt() - 1;
			leftupper[x][y] = -1;
			rightlower[x][y] = -1;
		}
		for (int y = 0; y < H; y++) {
			int free = 0;
			for (int x = W - 1; x >= 0; x--)
				if (leftupper[x][y] == -1)
					free = 0;
				else {
					free++;
					leftupper[x][y] = free;
				}
		}
		for (int x = 0; x < W; x++) {
			int free = 0;
			for (int y = H - 1; y >= 0; y--)
				if (leftupper[x][y] == -1)
					free = 0;
				else {
					free++;
					if (leftupper[x][y] > free)
						leftupper[x][y] = free;
				}
		}
		for (int y = 0; y < H; y++) {
			int free = 0;
			for (int x = 0; x < W; x++)
				if (rightlower[x][y] == -1)
					free = 0;
				else {
					free++;
					rightlower[x][y] = free;
				}
		}
		for (int x = 0; x < W; x++) {
			int free = 0;
			for (int y = 0; y < H; y++)
				if (rightlower[x][y] == -1)
					free = 0;
				else {
					free++;
					if (rightlower[x][y] > free)
						rightlower[x][y] = free;
				}
		}

		long result = 0;
		for (int x = 0; x < W; x++)
			for (int y = 0; y < H; y++)
				for (int len = L; len <= leftupper[x][y] && len <= H && len <= W; len++)
					if (x <= W - len && y <= H - len && leftupper[x][y] >= len
							&& rightlower[x + len - 1][y + len - 1] >= len)
						result++;

		System.out.println(result);
		System.exit(0);
	}

}