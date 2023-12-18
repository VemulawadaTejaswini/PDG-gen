import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a;
      String[] d = new String[n];

      for (int i = 0;  i < n  ; i ++ ) {
          a = scanner.nextInt();
          d[a - 1] = Integer.toString(i + 1);
      }

      for (int i = 0;  i < n ; i ++ ) {
         System.out.print(d[i]);
         System.out.print(" ");
      }

      return;
    }
  }