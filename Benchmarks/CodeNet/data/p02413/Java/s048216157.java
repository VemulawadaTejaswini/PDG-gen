import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] numbers = new int[r+1][c+1];

		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				numbers[i][j] = scanner.nextInt();
			}
		}

		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				numbers[i][c] += numbers[i][j];
			}
		}

		for(int i = 0; i <= c; i++){
			for(int j = 0; j < r; j++){
				numbers[r][i] += numbers[j][i];
			}
		}

		for(int i = 0; i <= r; i++){
			for(int j = 0; j < c; j++){
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(numbers[i][c]);
		}
		
	}
}