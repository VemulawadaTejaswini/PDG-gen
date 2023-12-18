import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while (stdin.hasNextLine()) {
			int tnum = stdin.nextInt();
			int hnum = stdin.nextInt();
			if (tnum == 0 && hnum == 0) break;
			int[] tarohands = new int[tnum];
			int[] hanahands = new int[hnum];
			for (int i = 0; i < tnum; i++){
				tarohands[i] = stdin.nextInt();
			}
			for (int i = 0; i < hnum; i++) {
				hanahands[i] = stdin.nextInt();
			}
			System.out.println(solve(tarohands, hanahands));
		}
		System.exit(0);
	}
	public static String solve(int[] taro, int[] hana) {
		int sumt = 0;
		int sumh = 0;
		for (int i = 0; i < taro.length; i++) {
			sumt += taro[i];
		}
		for (int i = 0; i < hana.length; i++) {
			sumh += hana[i];
		}
		if ((sumt + sumh) % 2 != 0) return "-1";
		// 基本的な考え方のみ．あとは，taro[i]-hana[j] > (sub/2)の場合ははhana[]にプラスするとか．
		int sub = sumt - sumh;
		Arrays.sort(taro);
		Arrays.sort(hana);
		for (int i = 0; i < taro.length; i++) {
			for (int j = 0; j < hana.length; j++) {
				if (taro[i] - hana[j] == (sub / 2)) {
					return Integer.toString(taro[i]) + " " + Integer.toString(hana[j]);
				}
			}
		}
		return "-1";
	}
}