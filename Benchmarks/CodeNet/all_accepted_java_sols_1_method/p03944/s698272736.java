import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		boolean[][] map = new boolean[H][W];
		for(int i = 0; i < N; i++) {
			if(a[i] == 1) {
				for(int j = 0; j < x[i]; j++) {
					for(int k = 0; k < H; k++) {
						map[k][j] = true;
					}
				}
			} else if(a[i] == 2) {
				for(int j = x[i]; j < W; j++) {
					for(int k = 0; k < H; k++) {
						map[k][j] = true;
					}
				}
				
			} else if(a[i] == 3) {
				for(int j = 0; j < W; j++) {
					for(int k = 0; k < y[i]; k++) {
						map[k][j] = true;
					}
				}
			} else {
				for(int j = 0; j < W; j++) {
					for(int k = y[i]; k < H; k++) {
						map[k][j] = true;
					}
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(map[i][j]) sum++;
			}
		}
		System.out.println(H * W -sum);
		
	}
}