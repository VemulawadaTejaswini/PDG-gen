import java.util.*;
import static java.lang.System.out;
public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      int A = sc.nextInt();
      int B = sc.nextInt();
      String S = sc.next();
      if(S.indexOf("-") == A){
         try{
            Integer.parseInt(S.substring(0,A));
            Integer.parseInt(S.substring(A+1,S.length()));
            System.out.println("Yes");
         }catch(NumberFormatException e){
            System.out.println("No");
         }
      }else{
         out.println("No");
      }
   }
}