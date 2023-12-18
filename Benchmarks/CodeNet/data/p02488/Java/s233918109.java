import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.next());
    String prevStr = sc.next();
    String str = null;
    for (int i = 1; i < num; i++) {
      if ((str = sc.next()).compareTo(prevStr) < 0) {
        prevStr = str;
      }
    }
    System.out.println(prevStr);
  }
}