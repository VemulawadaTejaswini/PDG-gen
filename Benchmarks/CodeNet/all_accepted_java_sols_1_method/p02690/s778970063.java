import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    sc.close();

    String ans = null;
    for (long i = -1000; ans == null && i <= 1000; i++)
      for (long j = -1000; ans == null && j <= 1000; j++)
        if (i * i * i * i * i - j * j * j * j * j == X)
          ans = i + " " + j;
    System.out.println(ans);
  }
}
