import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] A = new int[3][10];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 10; j++)
				A[i][j] = 0;
		
		int[][] B = new int[3][10];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 10; j++)
				B[i][j] = 0;
		
		int[][] C = new int[3][10];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 10; j++)
				C[i][j] = 0;
		
		int[][] D = new int[3][10];
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 10; j++)
				D[i][j] = 0;

		int n = sc.nextInt();

		String[][] N = new String[n][2];
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			
			f--;
			r--;
			
			if(b == 1)
				A[f][r] = A[f][r] + v;
			else if(b == 2)
				B[f][r] = B[f][r] + v;
			else if(b == 3)
				C[f][r] = C[f][r] + v;
			else
				D[f][r] = D[f][r] + v;
		}

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) 
				System.out.printf(" %d", A[i][j]);
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) 
				System.out.printf(" %d", B[i][j]);
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) 
				System.out.printf(" %d", C[i][j]);
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) 
				System.out.printf(" %d", D[i][j]);
			System.out.println();
		}
	}
}	
