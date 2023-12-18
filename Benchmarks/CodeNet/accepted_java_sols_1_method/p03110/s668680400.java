import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   double sum = 0;
   double pay = 0;
   String p ="";
   for(int i = 0;i<N;i++)
   {
     pay = sc.nextDouble();
     p = sc.next();
     if(p.equals("JPY")) sum += pay;
     else sum += pay*380000.0;
   }
   System.out.println(sum);
 }
}