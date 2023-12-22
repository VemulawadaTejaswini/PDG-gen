import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String  n = sc.next();
     char[] alpha = n.toCharArray();
     char check = 'A';
     char Check = 'Z';
     if(check<=alpha[0] && alpha[0]<=Check){
       System.out.println('A');
     }else{
       System.out.println('a');
     }

   }
}
