import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int i=0;
        int num=0;
        int A[]=new int[N+1];
        int B[]=new int[N+1];

        for(i=1;i<=N;i++){
            A[i]=sc.nextInt();
            B[A[i]]=i;
        }

        for(i=1;i<=N;i++){
            if(i==1){
                System.out.print(B[i]);
            }else{
                System.out.print(" "+B[i]);
            }
        }

        //END
    }
}

