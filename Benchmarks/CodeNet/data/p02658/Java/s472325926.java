import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int i=0;
        BigDecimal calc= BigDecimal.valueOf(1);

        BigDecimal tooBig= new BigDecimal("1000000000000000000");

        for(i=0;i<N;i++){
            float A=sc.nextFloat();
            BigDecimal a= BigDecimal.valueOf(A);

            BigDecimal zero=BigDecimal.valueOf(0);

            calc=a.multiply(calc);

            int ans=calc.compareTo(tooBig);

            if(ans==1){
                System.out.println("-1");
                break;
            }
            if(i==N-1){
                System.out.println(calc.add(zero));
            }
        }


        //END
    }
}

