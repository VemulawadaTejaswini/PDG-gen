import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for(int j = 1; j <= n; j++) {
      int x = j;
      if(x % 3 == 0) {
        System.out.print(" " + j);
        continue;
      }
      while(x > 0) {
        if(x % 10 == 3) {
          System.out.print(" " + j);
          break;
        }
        x /= 10;
      }
    }
    System.out.println();

  }
}
