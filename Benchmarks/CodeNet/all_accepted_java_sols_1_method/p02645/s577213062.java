import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        String S=sc.next();
        String[] strArray = S.split("");

        int i=0;
        for(i=0;i<3;i++){
            System.out.print(strArray[i]);
        }

        //END
    }
}

