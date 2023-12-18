import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		// ??\???
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		// ???????????£?¨?
		int A[][] = new int[n][m];
		int B[][] = new int[m][l];
		// ?????????????´?
		for(int i=0; i<n; i++){
			for(int i2=0; i2<m; i2++){
				int x = scan.nextInt();
				A[i][i2] = x;
			}
		}
		for(int i=0; i<m; i++){
			for(int i2=0; i2<l; i2++){
				int x = scan.nextInt();
				B[i][i2] = x;
			}
		}
		
		// 	???????±????????
		for(int i=0; i<n; i++){
			int x = 0;
			long y = 0;
			for(int j=0; j<l; j++){
				long C = 0;
				for (int k=0; k<m; k++){
					y = A[i][k]*B[k][j];
					C = C + y;
					// ??????
					if(k == (m-1)){
						System.out.print(C);
						x++;
						if(x == l) x = 0;
						else System.out.print(" ");
						
					}
				}
			}
			System.out.println();
		}
			
		
	}

}