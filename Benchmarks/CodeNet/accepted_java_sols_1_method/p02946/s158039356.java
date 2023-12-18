import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int K = in.nextInt();
      int X = in.nextInt();
      int start = X - K + 1;
      int end = X + K - 1;
      
      System.out.print(start);
      for (int i = start + 1; i <= end; ++i) {
        System.out.print(" " + i);
      }
      System.out.println();
    }
  }
}