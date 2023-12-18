import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int val1;
         int val2;

         val1 = sc.nextInt();
         val2 = sc.nextInt();

         if(val1 == val2) {
             System.out.println("Yes");
         }
         else {
             System.out.println("No");
         }
    }
}