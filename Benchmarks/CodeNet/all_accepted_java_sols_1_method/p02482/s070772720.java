import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = Integer.parseInt(sc.next());
    b = Integer.parseInt(sc.next());
    if (a > b) {
      System.out.println("a > b");
    } else if (a < b) {
      System.out.println("a < b");
    } else {
      System.out.println("a == b");
    }
  }
}