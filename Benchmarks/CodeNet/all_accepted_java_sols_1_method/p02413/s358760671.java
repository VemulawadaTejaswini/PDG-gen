import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int data[][] = new int[r + 1][c + 1];
		
		for(int i = 0; i <= r; i++) {
			for(int j = 0; j <= c; j++) {
				if( j == c && i != r) {
					data[r][c] += data[i][c];
				}else if( i != r){
					data[i][j] = scan.nextInt();
					data[i][c] += data[i][j];
					data[r][j] += data[i][j];
				}
			}
		}
		
		for(int i = 0; i <= r; i++) {
			for(int j = 0; j <= c; j++) {
				if( j == c) {
					System.out.println(data[i][j]);
				}else {
					System.out.print(data[i][j] + " ");
				}
			}
		}
		
		
	}
}

