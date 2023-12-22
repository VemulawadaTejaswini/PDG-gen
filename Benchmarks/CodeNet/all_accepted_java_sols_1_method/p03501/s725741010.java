import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int a = sc.nextInt();
   int b = sc.nextInt();
   
   int planA = n * a;
   int planB = b;
   
   if(planA > planB){
   	System.out.print(planB);
   }else{
     System.out.print(planA);
   }
 }
}