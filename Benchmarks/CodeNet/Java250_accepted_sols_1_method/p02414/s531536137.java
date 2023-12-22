import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  matrixALine = scanner.nextInt();
	  	int  matrixARow = scanner.nextInt();
	  	int  matrixBRow = scanner.nextInt();
	  	long[][] arrayA;//配列確保
	  	long[][] arrayB;//配列確保
	  	long[][] arrayC;//配列確保
		arrayA = new long[matrixALine + 10][matrixARow + 10];
		arrayB = new long[matrixARow + 10][matrixBRow + 10];
		arrayC = new long[matrixALine + 10][matrixBRow + 10];
		long sum = 0;
  	
		//初期化
		
		// Aのデータ入力
		for (int i = 0; i < matrixALine; i++) {
			for (int j = 0; j < matrixARow; j++) {
				arrayA[i][j] = scanner.nextInt();
		    }
		}
		// Bのデータ入力
		for (int i = 0; i < matrixARow; i++) {
			for (int j = 0; j < matrixBRow; j++) {
				arrayB[i][j] = scanner.nextInt();
		    }
		}
		
		// Cのデータ作成
		for(int i = 0; i < matrixALine; i ++){
			for(int k  = 0; k <matrixBRow; k ++){
				for(int j = 0; j < matrixARow; j ++){
					sum += arrayA[i][j] * arrayB[j][k];
				}
				arrayC[i][k] = sum;
				sum = 0;
			}
		}
  		
		//出力
		for (int i = 0; i < matrixALine; i++) {
			for (int j = 0; j < matrixBRow; j++) {
		        if(j == (matrixBRow -1) )
					System.out.println(arrayC[i][j] );
		        else
					System.out.print(arrayC[i][j] + " ");
		    }
		}
		scanner.close();
	}
}

