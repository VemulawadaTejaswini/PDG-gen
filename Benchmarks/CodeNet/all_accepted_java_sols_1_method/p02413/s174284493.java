import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       int c=sc.nextInt();
       int [][]a=new int[r][c];
       int sum=0;
       for(int j=0;j<r;j++){
           for(int k=0;k<c;k++){
               a[j][k]=sc.nextInt();
               System.out.print(a[j][k]+" ");
               sum+=a[j][k];
           }
           System.out.println(sum);
           sum=0;
       }
       
       int sumall=0;
       for(int j=0;j<c;j++){
           for(int k=0;k<r;k++){
               sum+=a[k][j];
           }
           System.out.print(sum+" ");
           sumall+=sum;
           sum=0;
       }
       System.out.println(sumall);
       
    }
}

