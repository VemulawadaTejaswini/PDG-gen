import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    while (0 < N) {
      int n = in.nextInt();
      if (n % 2 == 0 && (n % 3 != 0 && n % 5 != 0)) break;
      N--;
    }
    System.out.println(0 < N ? "DENIED" : "APPROVED");
  }
}