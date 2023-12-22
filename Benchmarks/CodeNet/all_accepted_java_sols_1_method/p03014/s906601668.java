
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] str = new String[H + 1];
		for(int i = 1; i < H + 1; i++) {
			str[i] = sc.next();
		}
		int[][] lump = new int[W + 1][H + 1];
		for(int i = 1; i < W + 1; i++) {
			for(int j = 1; j < H + 1; j++) {
				lump[i][j] = -1;
			}
		}
		for(int j = 1; j < H + 1; j++) {
			int wide = 0;
			int min = 0;
			for(int i = 1; i < W + 1; i++) {
				if(str[j].charAt(i - 1) == '.') {
					wide++;
					if(min == 0) {
						min = i;
					}
				} else {
					if(wide != 0) {
						for(int k = min; k < i; k++) {
							lump[k][j] += wide;
						}
						wide = 0;
						min = 0;
					}
				}
			}
			if(min != 0) {
				for(int i = min; i < W + 1; i++) {
					lump[i][j] += wide;
				}
			}
		}
		for(int i = 1; i < W + 1; i++) {
			int high = 0;
			int min = 0;
			for(int j = 1; j < H + 1; j++) {
				if(str[j].charAt(i - 1) == '.') {
					high++;
					if(min == 0) {
						min = j;
					}
				} else {
					if(high != 0) {
						for(int k = min; k < j; k++) {
							lump[i][k] += high;
						}
						high = 0;
						min = 0;
					}
				}
			}
			if(min != 0) {
				for(int j = min; j < H + 1; j++) {
					lump[i][j] += high;
				}
			}
		}
		int ans = 0;
		for(int i = 1; i < W + 1; i++) {
			for(int j = 1; j < H + 1; j++) {
				ans = Math.max(ans, lump[i][j]);
			}
		}
		System.out.println(ans);
	}

}
