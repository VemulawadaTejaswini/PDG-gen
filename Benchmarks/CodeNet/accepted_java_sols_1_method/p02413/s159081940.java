import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int worksum = 0;
		int sheet[][] = new int[r+1][c+1];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				sheet[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				worksum += sheet[i][j];
			}
			sheet[i][c] = worksum;
			worksum = 0;
		}
		for(int i = 0; i < c + 1; i++){
			for(int j = 0; j < r; j++){
				worksum += sheet[j][i];
			}
			sheet[r][i] = worksum;
			worksum = 0;
		}
		
		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				System.out.print(sheet[i][j]);
				if(j == c){
					System.out.println("");
				}else{
					System.out.print(" ");
				}
			}
		}
	}
}