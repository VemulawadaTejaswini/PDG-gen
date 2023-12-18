import java.util.Scanner;

//20180510
//01

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] output = new int[100+1][100+1];

		for(int i = 0;i < r;i++) {
			int ans_r = 0;
			for(int j = 0;j < c;j++) {
				output[i][j] = scanner.nextInt();
				ans_r += output[i][j];
				output[r][j] += output[i][j];
			}
			output[i][c] += ans_r;
		}

		for(int y = 0;y < c;y++) {
			output[r][c] += output[r][y];
		}

		scanner.close();

		for(int i = 0;i <= r;i++) {
			for(int j = 0;j < c;j++) {
					System.out.printf("%d ",output[i][j]);
			}
			System.out.println(output[i][c]);
		}
    }
}
