import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int r=0, c=0, x=0;
        int i, j, k, l, m, n;
        r=scan.nextInt();
        c=scan.nextInt();
        int[][] a=new int[r+1][c+1];
        
        for (i=0; i<r; i++) {
        for (j=0; j<c; j++) {
            x=scan.nextInt();
            a[i][j] = x;
            }
        }
        for (k=0; k<r; k++) {
        for (l=0; l<c; l++) {
            a[k][c] += a[k][l];
            }
        }
        for(m=0; m<=c; m++){ 
        for(n=0; n<r; n++){
            a[r][m] += a[n][m];
            }
        }
        for(i = 0; i <= r; i++){
			System.out.printf("%d", a[i][0]);
			for(j = 1; j <= c; j++){
				System.out.printf(" %d", a[i][j]);
			}
			System.out.printf("\n");
		}
    }
}
