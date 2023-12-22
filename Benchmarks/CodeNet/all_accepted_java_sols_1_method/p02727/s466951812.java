import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    long[] p = new long[a];
    long[] q = new long[b];
    long[] r = new long[c];

    for (int i = 0; i < a; i++) {
      p[i] = sc.nextLong();
    }

    for (int i = 0; i < b; i++) {
      q[i] = sc.nextLong();
    }

    for (int i = 0; i < c; i++) {
      r[i] = sc.nextLong();
    }

    Arrays.sort(p);
    Arrays.sort(q);
    Arrays.sort(r);

    long[] data = new long[x+y+c];
    int count = 0;

    for (int i = a-x; i < a; i++) {
      data[count] = p[i];
      count++;
    }

    for (int i = b-y; i < b; i++) {
      data[count] = q[i];
      count++;
    }

    for (int i = 0; i < c; i++) {
      data[count] = r[i];
      count++;
    }

    Arrays.sort(data);

    long sum = 0;

    for (int i = count-1; i >= count-x-y; i--) {
      sum += data[i];
    }

    System.out.println(sum);


  }

}
