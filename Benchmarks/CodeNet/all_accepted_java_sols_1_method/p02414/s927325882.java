import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		

		int m = sc.nextInt();
		
		int l = sc.nextInt();
		
		//n：Aの縦 m：Aの横Bの縦 l：Bの横
		
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				
				int a = sc.nextInt();
				
				
				A[i][j] = a;
				
				
			}
		}
		
		for(int k = 0;k < m;k++) {
			for(int p = 0;p < l;p++) {
				
				int b = sc.nextInt();
				
				B[k][p] = b;
				
				
			}
		}
		
		//Aの横とBの縦が同じことに注意する
		
		long sum = 0;
		long seki = 0;
		
		
		
		for(int q = 0;q < n;q++) {
			
			for(int r = 0;r < l;r++) {
				
				for(int s = 0;s < m;s++) {
					
					//sはAの横 rはBの縦 qはAの縦
					
					seki = A[q][s] * B[s][r];
					
					sum = sum + seki;
					
					
					
				}
				
				System.out.print(sum);
				
				sum = 0;
				if(r != l - 1) {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println("");
		}
		
		}



}

