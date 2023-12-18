import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        //int N=sc.nextInt();
        String S=sc.next();

        String[] strArray=S.split("");

        int i=0;

        String str="P";

        for(i=0;i<S.length();i++){
            if((strArray[i].equals(str))){
                System.out.print("P");
            }else{
                System.out.print("D");
            }
        }

        //END
    }
}

