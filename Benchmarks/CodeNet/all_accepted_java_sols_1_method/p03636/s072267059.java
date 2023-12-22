import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String s = sc.next();

   int sl =s.length()-2;
   
   String ans = s.substring(0,1)+sl+s.substring(sl+1,sl+2);
 
   System.out.println(ans);
 }
}