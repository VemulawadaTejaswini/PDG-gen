import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[][][] data = new int[4][3][10];
		
		for(int i = 0; i < n; i++) {
			int b = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			int v = stdIn.nextInt();
			
			data[b-1][f-1][r-1] += v;
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 10; k++) {
					System.out.print(" " + data[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3) {
			System.out.println("####################");
			}
		}
	}

}