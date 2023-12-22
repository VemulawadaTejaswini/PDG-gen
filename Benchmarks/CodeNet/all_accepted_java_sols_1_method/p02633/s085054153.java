import java.util.*;

public class Main {
  
 public static void main(String[] args) {
   final Scanner sc = new Scanner(System.in);
   final int X = sc.nextInt();
   for (int i = 1; i <= 360; ++i) {
     if ((i*X) % 360 == 0) {
       System.out.println(i);
       return;
     }
   }   
 }  
}