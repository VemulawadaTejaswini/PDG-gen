import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   double N = sc.nextDouble();

   int sss = (int)Math.ceil(N/111);
   System.out.println(111*sss);
 }
}