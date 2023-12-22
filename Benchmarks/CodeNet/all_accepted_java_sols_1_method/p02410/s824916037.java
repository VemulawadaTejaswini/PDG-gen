import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];
        int[] B = new int[m];
        int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            B[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int a=0;
            for(int j=0;j<m;j++){
               a+=A[i][j]*B[j];
            }
            System.out.println(a);
        }
    }
}

