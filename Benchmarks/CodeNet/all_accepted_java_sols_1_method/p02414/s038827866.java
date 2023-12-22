import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		//二つの行列の行と列を宣言
		int row = scan.nextInt();
		int columnRow = scan.nextInt();
		int column = scan.nextInt();

		//二つの行列(二次元配列)を宣言
		int[][] matrixA = new int[row][columnRow];
		int[][] matrixB = new int[columnRow][column];
		long[][] matrixC = new long[row][column];

		//行列Aのためのループ
		for(int rowI = 0 ;rowI < row;rowI++){
			for(int columnRowI =0 ;columnRowI < columnRow ;columnRowI++){
				//行列Aの入力
				matrixA[rowI][columnRowI] = scan.nextInt();
			}
		}

		//行列Bのためのループ
		for(int columnRowI = 0 ;columnRowI < columnRow;columnRowI++){
			for(int columnI =0 ;columnI < column ;columnI++){
				//行列Bの入力
				matrixB[columnRowI][columnI] = scan.nextInt();
			}
		}

		//行列Cの計算のためのループ
		for(int rowI = 0 ;rowI < row;rowI++){
			for(int columnRowI =0 ;columnRowI < column ;columnRowI++){
				for(int columnI =0 ;columnI < columnRow ;columnI++){

					//行列Cの入力
					matrixC[rowI][columnRowI]
							+= matrixA[rowI][columnI] * matrixB[columnI][columnRowI];
				}
			}
		}
		for(int rowI = 0 ;rowI < row;rowI++){
			for(int columnI = 0 ;columnI < column ;columnI++){
				if(columnI+ 1 == column){
					System.out.println(matrixC[rowI][columnI]);
				}else if(columnI < column){
					System.out.print(matrixC[rowI][columnI] + " ");
				}
			}
		}
		scan.close();
	}
}

