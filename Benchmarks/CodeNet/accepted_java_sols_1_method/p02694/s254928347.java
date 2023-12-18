import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long cash = 100;
    int res = 0;
    while (cash < x) {
      cash *= 1.01;
      res++;
    }
    System.out.println(res);
    sc.close();
  }
}