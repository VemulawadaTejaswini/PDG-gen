import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int[] d=new int[N+10];

        int i=0;
        int j=0;
        int sum=0;

        for(i=0;i<N;i++){
            d[i]=sc.nextInt();
        }

        for(i=0;i<N-1;i++){
            for(j=1;i+j<N;j++){
                sum=sum+d[i]*d[i+j];
            }
        }

        System.out.println(sum);

        //END
    }
}
