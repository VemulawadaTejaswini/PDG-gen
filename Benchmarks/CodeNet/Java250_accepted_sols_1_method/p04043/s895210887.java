import java.util.*;
public class Main{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     String ans = "NO";
     if(a*b*c==5*7*5)ans="YES";
     System.out.println(ans);
   }
}