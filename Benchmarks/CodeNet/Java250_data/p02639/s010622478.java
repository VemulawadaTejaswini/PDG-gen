import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    a();
  }

  public static void a() {
    try (Scanner sc = new Scanner(System.in)) {
      int[] a = new int[5];
      a[0] = Integer.parseInt(sc.next());
      a[1] = Integer.parseInt(sc.next());
      a[2] = Integer.parseInt(sc.next());
      a[3] = Integer.parseInt(sc.next());
      a[4] = Integer.parseInt(sc.next());

      int count = 0;

      for (int b : a) {
        if (b == 0) {
          if (count == 4) {
            System.out.println(a[3] + 1);
          } else {
            System.out.println(a[count + 1] - 1);
          }
        }
        count++;
      }
    }
  }
}