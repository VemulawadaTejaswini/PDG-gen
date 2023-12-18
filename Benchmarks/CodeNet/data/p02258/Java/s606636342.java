import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] r = new long[n];
    long diff = 0;
    for(int i = 0; i < n; i++) {
      r[i] = sc.nextLong();
    }
    long max = r[2] - r[1];
    for(int i = 0; i < n - 1; i++) {
      diff = r[i + 1] - r[i];
      for(int j = i + 2; j < n ; j++) {
        if(r[j] - r[i] >= diff) {
          diff = r[j] - r[i];
        }
      }
      if(diff >= max) {
        max = diff;
      }
    }
    System.out.println(max);
  }
}

