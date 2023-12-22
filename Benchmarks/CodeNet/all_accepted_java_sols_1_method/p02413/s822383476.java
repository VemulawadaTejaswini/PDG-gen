import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][]rc = new int[r+1][c+1];
        int sum =0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rc[i][j]=scn.nextInt();
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rc[i][c]+=rc[i][j];
            }
        }
        

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rc[r][j]+=rc[i][j];
                sum+=rc[i][j];
            }
        }
        
        rc[r][c]=sum;

        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                if(j==c){
                    System.out.print(rc[i][j]+"\n");
                }else{
                    System.out.print(rc[i][j]+" ");
                }                               
            }
        }        
        
        
        
    }
}