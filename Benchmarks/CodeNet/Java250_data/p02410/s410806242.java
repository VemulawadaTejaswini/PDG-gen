import java.util.Scanner;


public class Main {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int m = sc.nextInt();
		
		int[][] A = new int[n][m];
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				
				int a = sc.nextInt();
				
				
				A[i][j] = a;
				
						
						
			}
		}
		
		int[] B = new int[m];
		
		for(int k = 0;k < m;k++) {
			
			int b = sc.nextInt();
			
			
			B[k] = b;
			
			
		}
		
		//Aは要素Aの配列、Bは要素Bの配列
		
		int sum = 0;
		int seki;
		
		for(int x = 0;x < n;x++) {
			sum = 0;
			
			
			for(int y = 0;y < m;y++) {
				
				
				
				
				seki = A[x][y] * B[y];
				sum = sum + seki;
				
				
			}
			
			System.out.println(sum);
		}
		
		
		
		
		
		
		
		}



}

