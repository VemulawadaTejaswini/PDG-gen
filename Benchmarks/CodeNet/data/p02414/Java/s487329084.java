import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		int[][] c = new int[n][l];
		int sum = 0;
		//a???????????????
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				a[i][j] = scan.nextInt();
			}
		}
		//b???????????????
		for(int i=0; i<m; i++){
			for(int j=0; j<l; j++){
				b[i][j] = scan.nextInt();
			}
		}
		//??????c?????????????´?
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				sum = 0;
				for(int k=0; k<m; k++){
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		//???????????????
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				System.out.print(c[i][j]);
				if(j < l){
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
    }
}