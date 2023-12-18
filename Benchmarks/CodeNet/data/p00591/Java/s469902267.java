import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		try{
			while((str = br.readLine()) != null){
				// nを取得して配列を作成
				int n = Integer.parseInt(str);
				if(n == 0) return;
				int tallMatrix[][] = new int[n][n];
				boolean isLeftUp[][] = new boolean[n][n];
				boolean isRightUp[][] = new boolean[n][n];

				// 行列を入力
				for(int row = 0; row < n; row++){
					str = br.readLine();
					String array[] = str.split(" ");
					for(int column = 0; column < n; column++){
						tallMatrix[row][column] = Integer.parseInt(array[column]);
					}
				}
				//printMatrix(tallMatrix);

				// 左手を挙げる
				for(int row = 0; row < n; row++){
					// 一番低い身長を求める
					int shortestScore = tallMatrix[row][0];
					for(int column = 1; column < n; column++){
						if(tallMatrix[row][column] < shortestScore)
							shortestScore = tallMatrix[row][column];
					}
					// 一番低い人の手を挙げさせる
					for(int column = 0; column < n; column++){
						if(tallMatrix[row][column] == shortestScore)
							isLeftUp[row][column] = true;
					}
				}
				//printMatrix(isLeftUp);

				// 右手を挙げる
				for(int column = 0; column < n; column++){
					// 一番高い身長を求める
					int tallestScore = tallMatrix[0][column];
					for(int row = 1; row < n; row++){
						if(tallMatrix[row][column] > tallestScore)
							tallestScore = tallMatrix[row][column];
					}
					// 右手を挙げさせる
					for(int row = 0; row < n; row++){
						if(tallMatrix[row][column] == tallestScore)
							isRightUp[row][column] = true;
					}
				}

				// 両手を挙げている生徒の身長を求める
				int resultTall = 0;
				for(int row = 0; row < n; row++){
					for(int column = 0; column < n; column++){
						if(isLeftUp[row][column]&&isRightUp[row][column]){
							resultTall = tallMatrix[row][column];
							break;
						}
					}
					if(resultTall != 0) break;
				}
				System.out.println(resultTall);

			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static void printMatrix(int matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}

	static void printMatrix(boolean matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}
}

/*
 * 上級アルゴリズムのクラスでは，n^2 の生徒が n*n に座っている
 */