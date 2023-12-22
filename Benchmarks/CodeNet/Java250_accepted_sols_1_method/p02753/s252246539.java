import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   char[] c = sc.next().toCharArray();
 
   String ans = "Yes";
   if(c[0] == c[1] && c[1] == c[2]) ans = "No";
   System.out.print(ans);
 }
}