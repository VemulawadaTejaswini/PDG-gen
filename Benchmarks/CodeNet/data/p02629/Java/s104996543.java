import static java.lang.Long.parseLong;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = parseLong(sc.next()) - 1;
    StringBuilder sb = new StringBuilder();
    while (n >= 26) {
      sb.insert(0, (char) ('a' + n % 26));
      n /= 26;
      n--;
    }
    sb.insert(0, (char) ('a' + n));
    System.out.println(sb);
  }
}