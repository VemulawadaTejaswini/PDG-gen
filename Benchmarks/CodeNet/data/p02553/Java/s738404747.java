import java.util.*;
public class Main {
 public static void main (String [] args) {
  Scanner it = new Scanner (System.in); 
   int a = it.nextInt();
   int b = it.nextInt();
   int c = it.nextInt();
   int d = it.nextInt();
   if (d > 0 && b > 0) {
    System.out.println(d*b);
   }
   else if (b < 0 && d > 0) {
     System.out.println(b*c);
   }
   else if (b > 0 && d < 0) {
     System.out.println(d*a);
   }
   else if (b <= 0 && d <= 0) {
     System.out.println(a*c);
   }
 }
  
}