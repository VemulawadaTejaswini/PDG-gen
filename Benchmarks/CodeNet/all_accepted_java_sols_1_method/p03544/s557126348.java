import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N == 1) {
      System.out.println(1);
      return;
    }
    long Lpp = 2;
    long Lp = 1;
    long L = 0;
    int n = 2;
    while (n <= N) {
      L = Lpp + Lp;
      
      Lpp = Lp;
      Lp = L;
      n++;
    }
    System.out.println(L);
  }
}