import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ary=new int[3][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                ary[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int gt=0;
        for(int i=0;i<n;i++){
            if(ary[0][i]-ary[1][i]>0){
                gt+=ary[0][i]-ary[1][i];
            }
        }
        System.out.println(gt+"\n");
    }
}