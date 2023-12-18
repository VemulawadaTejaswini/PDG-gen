import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        if(A>=1&&A<=9&&B>=1&&B<=9){
            System.out.println(A*B);
        }else{
            System.out.println(-1);
        }

        //END

    }
}

