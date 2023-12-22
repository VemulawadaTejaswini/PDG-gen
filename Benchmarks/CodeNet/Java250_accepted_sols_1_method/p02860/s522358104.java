import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      sc.nextLine();

      String s = sc.nextLine();

      if(n % 2 != 0) {
        System.out.print("No");
      } else {
          if(s.substring(0, n/2).equalsIgnoreCase(s.substring(n/2, n))) {
              System.out.print("Yes");
          } else {
              System.out.print("No");
          }
      }


    }
}