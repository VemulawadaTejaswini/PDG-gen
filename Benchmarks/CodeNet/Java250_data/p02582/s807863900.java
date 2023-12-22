import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int ans = 0;
    if (s.equals("SSS"))
      ans = 0;
    if (s.equals("SSR"))
      ans = 1;
    if (s.equals("SRS"))
      ans = 1;
    if (s.equals("SRR"))
      ans = 2;
    if (s.equals("RSS"))
      ans = 1;
    if (s.equals("RSR"))
      ans = 1;
    if (s.equals("RRS"))
      ans = 2;
    if (s.equals("RRR"))
      ans = 3;
    System.out.println(ans);
    sc.close();
  }
}