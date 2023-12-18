import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.next();
   String T = sc.next();
   String tmp = S ;
   boolean flg = false;
   
   for(int i=0;i<S.length();i++)
   {
     tmp = tmp.substring(S.length()-1,S.length()) + tmp.substring(0,S.length()-1);
     if(T.equals(tmp))
     {
       flg = true;
       break;
     }
   }
   
   if(flg) System.out.println("Yes");
   else System.out.println("No");
 }
}