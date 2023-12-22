import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long N = sc.nextLong();
    long M = sc.nextLong();

    sc.close();

    if (N * 2 < M) {
      System.out.println(N + (M - N * 2) / 4);
    } else {
      System.out.println(M / 2);
    }
    
  }

}