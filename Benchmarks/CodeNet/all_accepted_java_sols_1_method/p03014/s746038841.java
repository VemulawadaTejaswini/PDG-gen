import java.util.Scanner;

/**
 * 2019/06/09
 * AtCoder Beginner Contest 129
 * 
 * D - Lamp
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean S[][] = new boolean[H][W];		// 障害物なし：true 障害物あり：false
		for(int i = 0; i < H; i++) {
			String line = sc.next();
			for(int j = 0; j< W; j++) {
				S[i][j] = (line.charAt(j) == '.');
			}
		}
		
		int cnts[][] = new int[H][W];
		// 横方向計
		for(int i = 0; i < H; i++) {
			int cntsj = 0;
			int tmpSum = 0;
			for(int j = 0; j < W; j++) {
				if(S[i][j] == false) {
					while(cntsj < j) {
						cnts[i][cntsj] = tmpSum;
						cntsj++;
					}
					cnts[i][cntsj] = 0;
					cntsj++;
					tmpSum = 0;
				} else {
					tmpSum++;
				}
			}
			while(cntsj < W) {
				cnts[i][cntsj] = tmpSum;
				cntsj++;
			}
		}
		// 縦方向加算
		for(int j = 0; j < W; j++) {
			int cntsi = 0;
			int tmpSum = 0;
			for(int i = 0; i < H; i++) {
				if(S[i][j] == false) {
					while(cntsi < i) {
						cnts[cntsi][j] += tmpSum - 1;
						cntsi++;
					}
					cntsi++;
					tmpSum = 0;
				} else {
					tmpSum++;
				}
			}
			while(cntsi < H) {
				cnts[cntsi][j] += tmpSum - 1;
				cntsi++;
			}
		}
		
		int max = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j< W; j++) {
				if(cnts[i][j] > max) {
					max = cnts[i][j];
				}
			}
		}
		System.out.println(max);
	}
	
}