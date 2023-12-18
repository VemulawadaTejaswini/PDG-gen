import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by xs on 8/18/2016.
 */
public class Main{
    public static void main(String[] args){
       // System.out.println("Hello World!");
        BigDecimal pi=new BigDecimal ("3.141592653589793238462643383279502884197169399375105820974944592307816406286");
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        while(cin.hasNext()){
            Integer num=cin.nextInt();
            System.out.println(pi.multiply(new BigDecimal(num*num+"")).toPlainString() +' '+pi.multiply(new BigDecimal(2*num+"")).toPlainString());
        }


    }
}