import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		
		int[][] A; 
		A = new int[n][m];
		int[][] B;
		B =new int[m][l];
		long[][]C;
		C = new long[n][l];
		
		
		
		for(int i=0;i<n;i++){
			for(int f=0;f<m;f++){
				int a = scanner.nextInt();
				A[i][f]=a;	
			}
		}
		
		for(int i=0;i<m;i++){
			for(int f=0;f<l;f++){
				int b = scanner.nextInt();
				B[i][f]= b;	
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				for(int k=0;k<m;k++){
					C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
					
				}
				
				System.out.print(C[i][j]);
				if(!(j == l-1)){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		scanner.close();
	}
}

