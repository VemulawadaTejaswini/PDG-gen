import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    sc.close();

    long x = (long) Math.sqrt((double)N);
    for (; x > 1; x--) {
      if (N%x==0) break;
    }

    System.out.println(x+N/x-2);
    return;
  }
}
