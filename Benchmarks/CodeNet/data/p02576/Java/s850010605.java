import java.util.*;

class Main{
 public static void main(String[] args){
  Scanner scn = new Scanner(System.in);
   long n = scn.nextLong();
   long x = scn.nextLong();
   long t = scn.nextLong();
   
   
   System.out.println((n+x-1)/x*t);
 }
  
}
