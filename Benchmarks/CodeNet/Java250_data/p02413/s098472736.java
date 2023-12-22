import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] numbers = new int[r + 1][c + 1];
		
		int sUB = 0;
		
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				numbers[i][j] = scan.nextInt();
			}
		}
		
		for(int k = 0; k < r; k++){
			int sB = 0;
			for(int l = 0; l < c; l++){
				sB = numbers[k][l] + sB;
			}
			numbers[k][c] = sB;
		}
		
		for(int l = 0; l < c; l++){
			int sU = 0;
			for(int k = 0; k < r; k++){
				sU = numbers[k][l] + sU;
			}
			numbers[r][l] = sU;
			
			sUB = numbers[r][l] + sUB;
		}
		numbers[r][c] = sUB;
		
		for(int p = 0; p < r + 1; p++){
			for(int q = 0; q < c + 1; q++){
				System.out.print(numbers[p][q]);
				if(q == c){
					System.out.print("");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}