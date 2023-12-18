import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] array = new int[r+1][c+1];
		int intTemp = 0;
		int intSumC = 0;
		int intSumR = 0;
		for(int i = 0; i <= r; i++){
			intSumC = 0;
			for(int j = 0; j <= c; j++){
				if(i == r && j == c){
					for(int k = 0; k < c; k++){
						array[r][c] += array[r][k];
						intSumC = array[r][c];
					}
				}else if(i == r){
					for(int k = 0; k < r; k++){
						array[r][j] += array[k][j];
					}
				}else if(j == c){
					for(int k = 0; k < c; k++){
						array[i][c] += array[i][k];
					}
				}else{
					intTemp = scan.nextInt();
					array[i][j] = intTemp;
					intSumC += intTemp;
				}
				array[i][c] = intSumC;

			}

		}
		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				if(j == c){
					System.out.println(array[i][j]);
				}else{
					System.out.print(array[i][j] + " ");
				}
			}
		}
		scan.close();
	}
}