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

        if(A<=B*2){
            System.out.println("0");
        }else{
            int C=A-B*2;
            System.out.println(C);
        }

        //END
    }
}
