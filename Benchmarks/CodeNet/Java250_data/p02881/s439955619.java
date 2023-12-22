import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();

        long i=0;
        long tmpI=0;
        long tmpJ=0;

        double rootN=Math.sqrt(N);
        //System.out.println(rootN);

        for(i=1;i<=(long)rootN;i++){
            if(N%i==0){
                tmpI=i;
                tmpJ=N/i;
            }
            //System.out.println(i+" "+tmpI+" "+tmpJ);
            if(i==(long)rootN){
                System.out.println(tmpI+tmpJ-2);
            }
        }

        //END
    }
}

