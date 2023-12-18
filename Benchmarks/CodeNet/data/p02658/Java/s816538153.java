import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long result = 1;

    long outNumber = 1;
    for(int i = 0; i < 18; i++) {
      outNumber *= 10;
    }

    for(int i = 0; i < n; i++) {
      result *= sc.nextLong();
      if(result == 0) {
        System.out.println(result);
        System.exit(0);
        break;
      }
    }
    sc.close();

    if(outNumber < result || result <= -1) {
      System.out.println(-1);
    } else {
      System.out.println(result);
    }
  }
}