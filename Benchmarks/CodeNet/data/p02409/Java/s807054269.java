import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] house1 = new int[3][10];
		int[][] house2 = new int[3][10];
		int[][] house3 = new int[3][10];
		int[][] house4 = new int[3][10];
		StringBuilder output = new StringBuilder();
		
		// 入居者数の初期化
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				house1[i][j] = 0;
				house2[i][j] = 0;
				house3[i][j] = 0;
				house4[i][j] = 0;
			}
		}
		
		// 入居者数の更新
		int infonum = scan.nextInt();
		for (int i = 0; i < infonum; i++) {
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			if (b == 1) {
				house1[f-1][r-1] += v;
			}
			if (b == 2) {
				house2[f-1][r-1] += v;
			}
			if (b == 3) {
				house3[f-1][r-1] += v;
			}
			if (b == 4) {
				house4[f-1][r-1] += v;
			}
		}
		
		// 出力
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				output.append(" ").append(house1[i][j]);
			}
			output.append('\n');
		}
		output.append("####################").append('\n');
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				output.append(" ").append(house2[i][j]);
			}
			output.append('\n');
		}
		output.append("####################").append('\n');
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				output.append(" ").append(house3[i][j]);
			}
			output.append('\n');
		}
		output.append("####################").append('\n');
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				output.append(" ").append(house4[i][j]);
			}
			output.append('\n');
		}
		System.out.print(output);
	}

}