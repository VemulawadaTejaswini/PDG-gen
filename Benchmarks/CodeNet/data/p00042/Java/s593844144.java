import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)
			throws NumberFormatException, IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		for (int c=1; ; c++) {
			int W = parseInt(br.readLine());
			if (W == 0) break;
			int N = parseInt(br.readLine());
			Item[] it = new Item[N];
			for (int i=0; i < N; i++) {
				it[i] = new Item(br.readLine());
			}
			int[][][] memo = makememo(N, W);
			int[] ans = knapsack(it, N-1, W, memo);
			System.out.println("Case " + c + ":");
			System.out.println(ans[0]);
			System.out.println(ans[1]);
		}
	}

	public static class Item {
		int value;
		int weight;

		public Item(String data) {
			String[] temp = data.split(",");
			value = parseInt(temp[0]);
			weight = parseInt(temp[1]);
		}
	}

	/*
	 * Item[] it?????????index i???????????§?????????????????????????????§
	 * ?????????????¨????w??\?????¨????????????????????§??????v????????§???????????????????????????
	 * ??????????????¨??????????¨??????????
	 */
	public static int[] knapsack(Item[] it, int i, int w, int[][][] memo) {
		int iv = it[i].value;
		int iw = it[i].weight;
		int[] ret = new int[2]; // {value, weight}

		if (memo[i][w][0] != -1) {
			return memo[i][w];
		}

		if (i == 0) {
			if (iw <= w) {
				ret[0] = iv;
				ret[1] = iw;
				return memo[i][w] = ret;
			} else {
				ret[0] = ret[1] = 0;
				return memo[i][w] = ret;
			}
		}

		if (iw > w) {
			return memo[i][w] = knapsack(it, i-1, w, memo);
		}

		int loadedv = knapsack(it, i-1, w-iw, memo)[0] + iv;
		int loadedw = knapsack(it, i-1, w-iw, memo)[1] + iw;
		int notloadedv = knapsack(it, i-1, w, memo)[0];
		int notloadedw = knapsack(it, i-1, w, memo)[1];
		if (loadedv > notloadedv) {
			ret[0] = loadedv;
			ret[1] = loadedw;
		} else if (notloadedv > loadedv) {
			ret[0] = notloadedv;
			ret[1] = notloadedw;
		} else {
			ret[1] = Math.min(loadedw, notloadedw);
			ret[0] = loadedv; // == notloadedv
		}
		return memo[i][w] = ret;
	}

	public static int[][][] makememo(int N, int W) {
		int[][][] memo = new int[N][W+1][2];
		for (int i=0; i < N; i++) {
			for (int j=0; j < W+1; j++) {
				memo[i][j][0] = -1;
			}
		}
		return memo;
	}
}