import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		//行と列の変数を宣言
		int row = scan.nextInt();
		int column = scan.nextInt();

		//行列の二次元配列を宣言
		int[][] matrix = new int[row][column];

		//ベクトルを宣言
		int[] vector = new int[column];
		int[] vectorAnswer = new int[row];

		//行列に入力した値を格納
		for(int rowI = 0 ;rowI < row ;rowI++){
			for(int columnI = 0 ;columnI < column;columnI++){
				matrix[rowI][columnI] = scan.nextInt();
			}
		}
		//ベクトルに入力した値を格納
		for(int columnI = 0 ;columnI < column ;columnI++){
			vector[columnI] = scan.nextInt();
		}
		//答えのベクトルを計算
		for(int rowI = 0 ;rowI < row ;rowI++){
			for(int columnI = 0 ;columnI < column;columnI++){
				vectorAnswer[rowI] += matrix[rowI][columnI] * vector[columnI];
			}
		}
		//計算したものを出力
		for(int rowI = 0 ;rowI < row ;rowI++ ){
			System.out.println(vectorAnswer[rowI]);
		}

	}
}

