import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
   public static void main(String args[]) throws IOException {
        Scanner input=new Scanner(System.in);
        long a=input.nextLong();
        float b=input.nextFloat();
        System.out.println(solve(a,b));
    }
   public static long solve(long a,float b) {
       BigDecimal A=new BigDecimal(""+a);
       BigDecimal B=new BigDecimal(""+b);
       BigDecimal C=A.multiply(B);
       return C.longValue();
   }
}
