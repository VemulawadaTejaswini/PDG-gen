import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   String S = sc.next();
   String T = sc.next();
   int a = sc.nextInt();
   int b = sc.nextInt();
   String X = sc.next();
 
   if(S.equals(X)) a--;
   else b--;
   System.out.println(a+ " " + b);
 }
}