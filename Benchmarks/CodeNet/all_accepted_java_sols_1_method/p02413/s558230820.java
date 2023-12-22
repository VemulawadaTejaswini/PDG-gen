import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] cell = new int[r+1][c+1];
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				cell[i][j] = sc.nextInt();
				
			}
			
		}

		for(int i = 0; i < r; i++) {
			int sum = 0;
			for(int j = 0; j < c; j++) {
				sum += cell[i][j];
				System.out.printf("%d ",cell[i][j]);
				
			}
			System.out.printf("%d",sum);
			System.out.println();
		}
		
		int total = 0;
		for(int j = 0; j < c; j++) {
			int sum = 0;
			for(int i = 0; i < r; i++) {
				sum += cell[i][j];
				}
			System.out.printf("%d ",sum);
			total += sum;
		}
		System.out.printf("%d",total);
		System.out.println();
		

	}
}
