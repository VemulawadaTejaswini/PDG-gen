import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < l; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
                for(int k = 0; k < l; k++){
                	long ans = 0;
                	for(int j = 0; j < m; j++){
                    ans += (a[i][j]*b[j][k]);
                }
                	System.out.print(ans);
                	
                	if(k < l-1) {
                		System.out.print(" ");
                	}
            }
            System.out.println("");
        }
    }
}
