import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());
    for (int i = 0; i < W; i++) {
      for (int j = 0; j < H; j++) {
        System.out.print("#");
      }
      System.out.print("\n");
    }
  }
}