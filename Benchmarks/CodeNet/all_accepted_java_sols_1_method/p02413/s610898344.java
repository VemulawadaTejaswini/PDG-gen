import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  r = scanner.nextInt();
	  	int  c = scanner.nextInt();
	  	int[][] array;//配列確保
        array = new int[r + 5][c + 5];
        
        //初期化
        for (int i = 0; i <= r; i++) {
        	for (int j = 0; j <= c; j++) {
        		array[i][j] = 0;
	        }
        }
        // データ入力
        for (int i = 0; i < r; i++) {
        	for (int j = 0; j < c; j++) {
        		array[i][j] = scanner.nextInt();
	        }
        }
        
        // データ補完
        for (int i = 0; i <= r; i++) {
        	for (int j = 0; j <= c; j++) {
	            if( j < c ) {
	            	array[i][c] += array[i][j];
	            }
		            
	            if( i < r ) {
	            	array[r][j] += array[i][j];
	            }

	            if( i == r && j == c )
	        	  	array[r][c] /= 2;
	            
        	}
        }
        
        for (int i = 0; i <= r; i++) {
        	for (int j = 0; j <= c; j++) {
	            if( j == c && i < r )
        			System.out.println(array[i][j] );
	            else if( j == c && i == r )
        			System.out.println(array[i][j]);
	            else
        			System.out.print(array[i][j] + " ");
	        }
        }
        scanner.close();
  }
}
