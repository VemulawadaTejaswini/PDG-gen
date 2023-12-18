import java.util.Scanner;

//解説を参考した
public class Main{
	public static int change(String s) {
		if (s.equals("#"))
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int H = sc.nextInt();
		final int W = sc.nextInt();
		final int K = sc.nextInt();

		String[][] s = new String[H][W];

		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++)
				s[i][j] = sc.next();

		int ans = 0;
		for (int is = 0; is < (1 << H); is++) {
			for (int js = 0; js < (1 << W); js++) {
				
				int count = 0;
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						//マスが消されているならcontinueする
						if (((is >>> i) & 1) == 1)
							continue;
						if (((js >>> j) & 1) == 1)
							continue;
						if (s[i][j].equals("#"))
							++count;
					}
				if (count == K)
					++ans;
				}
				
			}
		}

		System.out.println(ans);

	}

}
