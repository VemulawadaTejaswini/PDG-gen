//  Volume11-1127
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] matrixa=new int[n][m];
        int[] matrixb=new int[m];
        int outPint;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrixa[i][j]=scan.nextInt();
            }
        }
        for(int j=0; j<m; j++){
            matrixb[j]=scan.nextInt();
        }
        for(int i=0; i<n; i++){
            outPint=0;
            for(int j=0; j<m; j++){
                outPint+=matrixa[i][j]*matrixb[j];
            }
            System.out.println(outPint);
        }
    }
}
