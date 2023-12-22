import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int x = sc.nextInt();
   int t = sc.nextInt();
  
   int count=0;
   if (n%x != 0){
     count=(n/x)+1;
   }else if (n%x == 0){
     count=(n/x);
   }
   int time = count*t;
   System.out.println(time);
 }

}