import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      
      if (A < 1 || A > 9 || B < 1 || B > 9) {
        System.out.println(-1); 
      } else {
        System.out.println(A * B);
      }
    }
  }
}