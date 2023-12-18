import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt(), m = sc.nextInt(),l=sc.nextInt();    
        long[][] matrixA = new long[m][n];
        long[][] matrixC = new long[l][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrixA[j][i]=sc.nextLong();
            }
        }
        
        long x;
        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++){
                x=sc.nextLong();
                for(int k=0;k<n;k++){
                    matrixC[j][k]+=x*matrixA[i][k];
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(j!=0)System.out.print(" ");
                System.out.print(matrixC[j][i]);
            }
            System.out.println();
        }
    }
}

