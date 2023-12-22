import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int x = sc.nextInt();
   int t = sc.nextInt();

   int calc = n / x;
   if (n % x > 0) {
     calc++;
   }
   System.out.println(calc * t);
  }
}
