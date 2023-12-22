import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    String x = "", y = "";
    for (int i = 0; i < a; i++) x += Integer.toString(b);
    for (int i = 0; i < b; i++) y += Integer.toString(a);
    System.out.println((x.compareTo(y) < 0) ? x : y);
  }
}