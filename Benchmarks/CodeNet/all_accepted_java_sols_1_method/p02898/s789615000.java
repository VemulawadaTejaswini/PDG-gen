import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        int i=0;
        int tall=0;
        int count=0;

        for(i=0;i<N;i++){
            tall=sc.nextInt();
            if(tall>=K){
                count++;
            }
        }
        System.out.println(count);
        //END
    }
}

