import java.util.*;
import java.io.*;
public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long temp = a+b;
        long temp1 = (n/temp) * a;
       if(n%temp != 0) { 
               if(n % temp >= a) {
                      temp1 += a;
               }
               else 
                       temp1 += (n % temp);
       }
       System.out.println(temp1);
   }
}