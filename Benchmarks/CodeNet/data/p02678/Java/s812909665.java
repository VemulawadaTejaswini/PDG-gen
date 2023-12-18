import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int i=0;
        
        int[] A=new int[M+10];
        int[] B=new int[M+10];
        
        for(i=0;i<M;i++){
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
        }
        
        //END

    }
}

