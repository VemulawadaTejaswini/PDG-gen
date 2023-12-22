import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //START

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        String[] steps=str.split("");

        int i=0;
        int c=0;

        String strL="L";
        String strR="R";

        for(i=0;i<steps.length;i++){

            if(i%2==0){
                if(steps[i].equals(strL)){
                    System.out.println("No");
                    c=1;
                    break;
                }
            }else{
                if(steps[i].equals(strR)){
                    System.out.println("No");
                    c=1;
                    break;
                }
            }
        }

        if(c==0){
            System.out.println("Yes");
        }

        //END
    }
}

