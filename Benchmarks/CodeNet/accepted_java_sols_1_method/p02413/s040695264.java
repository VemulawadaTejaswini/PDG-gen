import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);

       int r=scan.nextInt();
       int c=scan.nextInt();

       int a[][]=new int[r+1][c+1];
       int sum=0;

       for(int i=0;i<r;i++){
           int rsum=0;
           int nsum=0;
           for(int j=0;j<c;j++){
               a[i][j]=scan.nextInt();
               rsum+=a[i][j];
               a[r][j]+=a[i][j];
           }
           a[i][c]=rsum;
           a[r][c]+=rsum;
       }

       for(int i=0;i<r+1;i++){
           for(int j=0;j<c+1;j++){
               System.out.print(a[i][j]);
               if(j<c){
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}

