import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int c1 = A + (int)Math.abs(B);
      int c2 = A * B;
      int c = c1 < c2 ? c2 : c1;
      System.out.println(c);
    }
  }
}