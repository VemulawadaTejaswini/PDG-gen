import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int H = Integer.parseInt(sc.next());
      int W = Integer.parseInt(sc.next());
      if (H == 0 && W == 0) break;
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (i == 0 || i == H - 1 || j == 0 || j == W - 1) {
            System.out.print('#');
          } else {
            System.out.print('.');
          }
        }
        System.out.print('\n');
      }
      System.out.print('\n');
    }
  }
}