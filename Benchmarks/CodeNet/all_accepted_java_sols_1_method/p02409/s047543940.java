import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[][][] data = new int[4][3][10];
		for(int i = 0; i < number;i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			
			data[b-1][f-1][r-1] += v;
		}
		for(int i = 0;i < 4;i++) {
			for(int j = 0; j < 3;j++){
				for(int r = 0;r < 10;r++) {
					System.out.print(" " + data[i][j][r]);
				}
				System.out.println();
			}
			if(i != 3) {
			System.out.println("####################");
			}
		}
	}

}

