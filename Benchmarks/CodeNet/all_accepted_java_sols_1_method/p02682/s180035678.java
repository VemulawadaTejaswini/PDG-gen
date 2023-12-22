import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int K=sc.nextInt();

        int max=0;
        int end1=0;
        int end2=0;

        if(A>=K){
            max=K;
            System.out.println(max);
        }else{
            max=max+A;
            end1=K-A;

            if(B>=end1){
                System.out.println(max);
            }else{
                end2=end1-B;

                if(C>=end2){
                    max=max-end2;
                    System.out.println(max);
                }else{
                    max=max-C;
                    System.out.println(max);
                }
            }
        }

        //END
    }
}
