import java.util.*;

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.next();
   String T = sc.next();
   
   if (S.length() == T.length() + 1)
   System.out.println(T.contains(S) ? "Yes" : "No");
 }
}
