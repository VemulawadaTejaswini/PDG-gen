import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] data = new long[3];

    for (int i = 0 ; i < 3; i++) {
      data[i] = sc.nextInt();
    }

    int k = sc.nextInt();
    long sum = 0;

    if (data[0] == 0 && data[1] == 0) {
      System.out.println((-1)*k);
      return;
    } else {
      long count = 0;
      for (int i = 0; i < 3; i++) {
        if (i == 0) {
          if (data[i] <= k) {
            sum += 1*data[i];
          } else {
            sum += 1*k;
          }
        }
        if (i == 1) {
          if (data[i]+count <= k) {
            sum += 0*data[i];
          } else {
            sum += 0*k;
          }
        }
        if (i == 2) {
          if (data[i]+count < k) {
            sum += (-1)*data[i];
          } else {
            sum += (-1)*(k-count);
          }
        }
        count += data[i];
        if (k <= count) break;
      }
    }
    System.out.println(sum);
  }

}
