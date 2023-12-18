import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();

    StringBuilder sb = new StringBuilder();
    for(int i=0;i<W+2;i++) {
      sb.append('#');
    }
    final String HEAD_FOOT = sb.toString();

    System.out.println(HEAD_FOOT);
    for(int i=0;i<H;i++) {
      System.out.print("#");
      System.out.print(scanner.next());
      System.out.println("#");
    }
    System.out.println(HEAD_FOOT);

    scanner.close();
  }
}
