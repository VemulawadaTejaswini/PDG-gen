import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] arr = new int[r+1][c+1];
		for(int i=0;i<r;i++) {
			int sumX = 0;
			for(int j=0;j<c;j++) {
				arr[i][j] = scanner.nextInt();
				sumX += arr[i][j];
			}
			arr[i][c] = sumX;
		}
		for(int i=0;i<c+1;i++) {
			int sumY = 0;
			for(int j=0;j<r+1;j++) {
				sumY += arr[j][i];
			}
			arr[r][i] = sumY;
		}
		
		for(int i=0;i<r+1;i++) {
			for(int j=0;j<c+1;j++) {
				if (j!=c) {
					System.out.print(arr[i][j] + " ");
				}else {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
