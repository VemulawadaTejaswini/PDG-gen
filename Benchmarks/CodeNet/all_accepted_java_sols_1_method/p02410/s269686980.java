import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int A[][]=new int[n][m];
        int B[]=new int[m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)B[i]=sc.nextInt();
        
        int C[]=new int[n];
        for(i=0;i<n;i++){
            C[i]=0;
            for(j=0;j<m;j++){
                C[i]+=A[i][j]*B[j];
            }
        }
        
        for(i=0;i<n;i++)System.out.println(C[i]);
    }
}
