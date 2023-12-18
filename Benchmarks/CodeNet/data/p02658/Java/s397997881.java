import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();

    long result = 1;

    long ten = 10;
    long outNumber = 1;

    for(int i = 0; i < 18; i++) {
      outNumber *= ten;
    }

    for(int i = 0; i < n; i++) {
      result *= sc.nextLong();
    }
    sc.close();

    if(outNumber < result) {
      System.out.println(-1);
    } else {
      System.out.println(result);
    }
  }
}