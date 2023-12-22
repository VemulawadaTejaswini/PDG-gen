import java.util.Scanner;
public class Main{
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String enzan = scan.next();
        int b = scan.nextInt();
        
        if (enzan.equals("+")) {
          System.out.println(a + b);
        } else {
          System.out.println(a - b);
        }
        scan.close();
   }
}
