import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int num;
    while (true) {
      num = Integer.parseInt(sc.next());
      if (num == 0) break;
      System.out.println("Case " + i + ": " + num);
      i++;
    }
  }
}