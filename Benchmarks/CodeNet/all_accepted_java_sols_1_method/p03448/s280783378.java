import java.util.*;

public class Main {
  public static void main(String[] argd) {
    Scanner sc = new java.util.Scanner(System.in);
    int A = Integer.parseInt(sc.nextLine());
    int B = Integer.parseInt(sc.nextLine());
    int C = Integer.parseInt(sc.nextLine());
    int X = Integer.parseInt(sc.nextLine());
    int count = 0;
    for (int a = 0; a <= A; a++) {
      for (int b = 0; b <= B; b++) {
        for (int c = 0; c <= C; c++) {
          int total = 500 * a + 100 * b + 50 * c;
          if (total == X) { count++; }
        }
      }
    }
    System.out.println(count);
  }
}
