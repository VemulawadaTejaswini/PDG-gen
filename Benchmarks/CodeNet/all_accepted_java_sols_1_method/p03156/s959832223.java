import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();
    final int A = scan.nextInt();
    final int B = scan.nextInt();
    int point1 = 0;
    int point2 = 0;
    int point3 = 0;

    for (int i = 0; i < N; i++) {
      int p = scan.nextInt();
      if (1 <= p && p <= A)
        point1++;
      else if (A < p && p <= B)
        point2++;
      else
        point3++;
    }
    System.out.println(Math.min(Math.min(point1, point2), point3));
  }
}
