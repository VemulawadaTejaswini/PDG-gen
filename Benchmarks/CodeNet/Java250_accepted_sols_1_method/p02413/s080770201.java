import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		// 入力
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] vector = new int[r + 1][c + 1];
		
		for ( int iR = 0; iR < r; iR++ ) {
			for ( int iC = 0; iC < c; iC++ ) {
				vector[iR][iC] = sc.nextInt();
				
			}
		}
		
		// 計算
		for ( int iR = 0; iR < r; iR++ ) {
			for ( int iC = 0; iC < c; iC++ ) {
				vector[iR][c] += vector[iR][iC];
				
			}
		}
		
		for ( int iC = 0; iC < c; iC++ ) {
			for ( int iR = 0; iR < r; iR++ ) {
				vector[r][iC] += vector[iR][iC];
				vector[r][c] += vector[iR][iC];
			}
		}
				
		// 出力
		for ( int iR = 0; iR < r+1; iR++ ) {
			for ( int iC = 0; iC < c+1; iC++ ) {
				System.out.print(vector[iR][iC]);
				if( iC != c ) {
					System.out.print(" ");
					
				} else {
					System.out.println();
					
				}
			}
		}
		
		sc.close();
	}

}