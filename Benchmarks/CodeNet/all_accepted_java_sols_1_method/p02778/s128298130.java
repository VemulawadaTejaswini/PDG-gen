import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   char[] c = sc.next().toCharArray();
 
   for(int i =0; i<c.length;i++)
   {
     c[i] = 'x';
   }
   String ans = new  String (c);
   System.out.println(ans);
 }
}