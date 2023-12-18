import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] SP = new int[r+1][c+1];

		for(int x = 0 ; x < r ; x++){
			for(int y = 0; y < c ; y++){
				SP[x][y] = scanner.nextInt();
				SP[x][c] = SP[x][c] + SP[x][y];
				SP[r][y] = SP[r][y] + SP[x][y];
				SP[r][c] = SP[r][c] + SP[x][y];
			}
		}
		for(int x = 0 ; x < r+1 ; x++){
			for(int y = 0; y < c+1 ; y++){
				if(y==c){
					System.out.print(SP[x][y] );
				}
				else{
					System.out.print(SP[x][y] + " ");
				}
			}
			System.out.println();
		}
	}

}