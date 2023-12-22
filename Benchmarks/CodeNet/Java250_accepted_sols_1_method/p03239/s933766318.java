import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int[] c = new int[n];
    int[] data_t = new int[n];
    int x = 0;

    for(int i = 0;i < n;i++) {
      c[i] = sc.nextInt();
      data_t[i] = sc.nextInt();
    }

    int min = 1001;

    for(int i = 0;i < n;i++) {
      if(data_t[i] <= t) {
        min = Math.min(min,c[i]);
        if(min == c[i]) x = c[i];
      }
    }

    if(min == 1001) {
      System.out.println("TLE");
    } else {
      System.out.println(x);
    }

  }

}