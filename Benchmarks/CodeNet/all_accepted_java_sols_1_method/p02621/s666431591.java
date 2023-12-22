import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
   public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int a = s.nextInt();
       long res = a;
       res += a*a +a*a*a;
       System.out.println(res);
   }
}