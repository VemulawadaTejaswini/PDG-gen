import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        //String N=sc.next();

        int N=sc.nextInt();
        int K=sc.nextInt();

        int[] p=new int[N];

        int i=0;

        for(i=0;i<N;i++){
            p[i]=sc.nextInt();
            //System.out.println(p[i]+" ");
        }

        Arrays.sort(p);

        int sum=0;

        for(i=0;i<K;i++){
            sum=sum+p[i];
            //System.out.println(p[i]);
        }

        System.out.print(sum);
        //END
    }
}




