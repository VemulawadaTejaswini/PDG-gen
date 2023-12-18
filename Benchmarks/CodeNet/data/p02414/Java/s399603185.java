import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		int[][] aryA = new int[n][m];
		int[][] aryB = new int[m][l];
		int[][] aryC = new int[n][l];
		
		//????????§?????????????´????????´???????
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				aryA[i][j] = in.nextInt();
			}
		}
		for(int i=0; i<m; i++){
			for(int j=0; j<l; j++){
				aryB[i][j] = in.nextInt();
			}
		}
		
		//??????????????????
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				for(int k=0; k<m; k++){
					aryC[i][j] += aryA[i][k]*aryB[k][j];
				}
			}
		}
		//??¨???
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				System.out.print(aryC[i][j]);
				if(j != l-1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}