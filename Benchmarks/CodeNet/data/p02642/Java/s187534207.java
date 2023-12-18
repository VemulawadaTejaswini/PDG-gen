import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    d();
  }

  public static void d() {
    try (Scanner sc = new Scanner(System.in)) {
      int y = Integer.parseInt(sc.next());
      Integer[] a = new Integer[y];
      for (int z = 0; z < y; z++) {
        a[z] = Integer.parseInt(sc.next());
      }
      int count = 0;
      Boolean flg = true;
      int aa = 0;
      for (int b : a) {
        int bb = 0;
        for (int c : a) {
          if (aa == bb) {
            bb++;
            continue;
          } else if (b % c == 0) {
            flg = false;
            break;
          }
          bb++;
        }
        if (flg) {
          count++;
        }
        aa++;
        flg = true;
      }
      System.out.println(count);

    } catch (Exception E) {
      System.out.println("エラー");
    }
  }
}