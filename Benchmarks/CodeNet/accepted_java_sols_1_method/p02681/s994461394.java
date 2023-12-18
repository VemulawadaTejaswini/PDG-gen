import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();

        String[] strArray1=A.split("");
        String[] strArray2=B.split("");

        int i=0;
        for(i=0;i<strArray1.length;i++){
            if(!(strArray1[i].equals(strArray2[i]))){
                System.out.println("No");
                break;
            }
            if(i==strArray1.length-1){
                if(strArray2.length==strArray1.length+1){
                    System.out.println("Yes");
                    break;
                }

            }
        }
        //END
    }
}
