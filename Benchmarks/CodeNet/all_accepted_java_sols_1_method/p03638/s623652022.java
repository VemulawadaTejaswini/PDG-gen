import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int[] a = new int[N];
		Arrays.setAll(a, i -> sc.nextInt());
		int x = 0;
		int[][] ans = new int[H][W];
		for(int i = 0; i < H; i++)
			for(int j = 0; j < W; j++) {
				if(a[x] <= 0)
					x++;
				ans[i][j] = x + 1;
				a[x]--;
			}
		for(int i = 0; i < H; i++) {
			if(i % 2 == 0)
				for(int j = 0; j < W; j++)
					System.out.print(ans[i][j] + " ");
			else
				for(int j = W-1; j >= 0; j--)
					System.out.print(ans[i][j] + " ");
			System.out.println();
		}
	}

}
