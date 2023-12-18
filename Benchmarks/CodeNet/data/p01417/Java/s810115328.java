

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);

		isUsed = new boolean[n];

		double[][] input = new double[n][3];

		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");

			for(int j = 0; j < 3; j++){
				input[i][j] = Double.parseDouble(tmpArray[j]);
			}
		}
		dfs(input, m, 0, 0);

		System.out.println(result);
	}

	static double result = 0;
	static boolean[] isUsed;

	//input カラー値 member メンバーの人数 depth 現在の階層（今見ているインデックス） count（既に使った色数）
	static void dfs(double input[][], int member, int depth, int count){
		isUsed[depth] = true;
		count++;

		if(count == member){
			calcDist(input);
		}
		else if(depth != input.length - 1){
			dfs(input, member, depth + 1, count);
		}

		isUsed[depth] = false;
		count--;
		if(depth != input.length - 1){
			dfs(input, member, depth + 1, count);
		}
	}

	static void calcDist(double input[][]){
//		printUsed();
		double sum = 0;
		for(int i = 0; i < input.length; i++){
			if(!isUsed[i]){
				continue;
			}
			for(int j = i + 1; j < input.length; j++){
				if(!isUsed[j]){
					continue;
				}
				for(int k = 0; k < 3; k++){
					sum += Math.pow(input[i][k] - input[j][k], 2);
				}
			}
		}

		result = Math.max(sum, result);
	}

	//for debug
	static void printUsed() {
		for(int i = 0; i < isUsed.length ; i++){
			System.out.print(isUsed[i]+" ");
		}
		System.out.println();
	}
}

