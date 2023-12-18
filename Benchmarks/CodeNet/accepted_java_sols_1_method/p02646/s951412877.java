import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        long A=sc.nextLong();
        long V=sc.nextLong();
        long B=sc.nextLong();
        long W=sc.nextLong();
        long T=sc.nextLong();

        long kyori=A-B;
        long KYORI=Math.abs(kyori);

        long HAYASA=V-W;

        long CALC=T*HAYASA;

        if(V<=W){
            System.out.println("NO");
        }else{
            if(CALC>=KYORI){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        //END
    }
}

