import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int A[][] = new int[n][m];
		int B[][] = new int[m][l];
		int i, j, k;
		long c;
		for(i = 0; i < n; i++){
			for(j = 0; j < m; j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < m; i++){
			for(j = 0; j < l; j++){
				B[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < n; i++) {
            for(j = 0; j < l; j++) {
                c = 0;
                for(k = 0; k < m; k++) {
                    c += A[i][k] * B[k][j];
                }
                if(j > 0){
                	System.out.print(" " + c);
                }
                else{
                	System.out.print("" + c);
                }
            }
		}
	}
}
