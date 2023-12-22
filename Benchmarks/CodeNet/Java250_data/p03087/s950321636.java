import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] l = new int[q];
    int[] r = new int[q];

    for (int i = 0; i < q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    int[] data = new int[n+1];

    for (int i = 0; i < n-1; i++) {
      if (s.substring(i,i+2).equals("AC")) {
        data[i+1] = data[i] + 1;
      } else {
        data[i+1] = data[i];
      }
    }

    // for (int i = 0; i < n; i++) {
    //   System.out.print(data[i]+" ");
    // }

    // System.out.println();

    for (int i = 0; i < q; i++) {
      System.out.println(data[r[i]-1]-data[l[i]-1]);
    }

  }

}
