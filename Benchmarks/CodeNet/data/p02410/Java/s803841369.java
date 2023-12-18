import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]A = new int[n][m];
        int[]b = new int[m];
        int[]c = new int [n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=scn.nextInt();
            }
        }
        
        for(int i=0;i<m;i++){
            b[i]=scn.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i]+=A[i][j]*b[j];
            }
            System.out.println(c[i]);
        }

        

        
    }



    
}