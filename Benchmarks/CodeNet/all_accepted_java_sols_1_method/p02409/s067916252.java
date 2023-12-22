import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]array1=new int [4][11];
        int [][]array2=new int [4][11];
        int [][]array3=new int [4][11];
        int [][]array4=new int [4][11];
        
        for(int i=1;i<=n;i++){
            int b=sc.nextInt();
            int f=sc.nextInt();
            int r=sc.nextInt();
            int v=sc.nextInt();
            switch(b){
                case 1:array1[f-1][r-1]+=v; break;
                case 2:array2[f-1][r-1]+=v; break;
                case 3:array3[f-1][r-1]+=v; break;
                case 4:array4[f-1][r-1]+=v; break;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.printf(" %d",array1[i][j]);
            }
            System.out.println();
        }System.out.println("####################");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.printf(" %d",array2[i][j]);
            }
            System.out.println();
        }System.out.println("####################");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.printf(" %d",array3[i][j]);
            }
            System.out.println();
        }System.out.println("####################");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.printf(" %d",array4[i][j]);
            }
            System.out.println();
        }
        
    }
}

