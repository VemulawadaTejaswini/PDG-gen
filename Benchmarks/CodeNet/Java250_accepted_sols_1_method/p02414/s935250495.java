import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        long [][]A;
        A = new long[n][m];
        long [][]B;
        B = new long[m][l];
        long [][]C;
        C = new long[n][l];
        int i,j,k;

        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
            A[i][j] = scan.nextLong();
            }
        }
        for(j = 0; j < m; j++){
            for(k = 0; k < l; k++){
            B[j][k] = scan.nextLong();
            }
        }
        for(k = 0; k < l; k++){
            for(j = 0; j < m; j++){
                for(i = 0; i < n; i++){
                C[i][k] += A[i][j]*B[j][k];
                }
            }
        }
        for(i = 0; i< n; i++){
        	for(k = 0; k< l; k++){
        		if(k != l-1){
        			System.out.print(C[i][k]+" ");
        		}
        		else{
        			System.out.println(C[i][k]);
        		}
        	}
        }      
    }
}     