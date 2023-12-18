import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int ans[][][]=new int[4][3][10];
           for(int k=0;k<4;k++){
           for(int i=0;i<3;i++){
               for(int j=0;j<10;j++){
                ans[k][i][j]=0;
               }
           }
        }
           int n=sc.nextInt();
           for(int i=0;i<n;i++){
            int b,f,r,v;
            b=sc.nextInt();
            f=sc.nextInt();
            r=sc.nextInt();
            v=sc.nextInt();
            --b;--f;--r;
            ans[b][f][r]+=v;
           }
           
           for(int k=0;k<4;k++){
            for(int i=0;i<3;i++){
                for(int j=0;j<10;j++){
                 if(j!=9)System.out.print(" "+ans[k][i][j]); 
                else System.out.println(" "+ans[k][i][j]); 
                }
            }
          if(k!=3)  System.out.println("####################");
        }
          
}
}

