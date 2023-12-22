import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int l=scan.nextInt();
        long outPint;
        int[][] matrixa=new int[n][m];
        int[][] matrixb=new int[m][l];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                matrixa[i][j]=scan.nextInt();
        
        for(int i=0; i<m; i++)
            for(int j=0; j<l; j++)
                matrixb[i][j]=scan.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<l; j++){
                outPint=0;
                for(int k=0; k<m; k++){
                    outPint+=matrixa[i][k]*matrixb[k][j];
                }
                System.out.print(outPint);
                if(j!=l-1)
                    System.out.print(" ");
            }
            System.out.println();
        }    
        
    }
}
