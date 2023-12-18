import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    String[] data = new String[n];

    int l = 0;

    for (int i = 0; i < n; i++) {
      data[i] = s.substring(i,i+1);
      if (data[i].equals("?")) {
        l++;
      }
    }


    int sum = Integer.MIN_VALUE;
    String ans = "";

    for (int i = 0; i < Math.pow(2,l); i++) {
      String k = "";
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (data[j].equals("?")) {
          if ((1&i >> j) == 1) {
            k += "P";
          } else {
            k += "D";
          }
        } else {
          k += data[j];
        }
      }

      for (int j = 0; j < n-1; j++) {
        String p = k.substring(j,j+2);
        if (p.equals("PD")) {
          count++;
        }
      }

      for (int j = 0; j < n; j++) {
        String p = k.substring(j,j+1);
        if (p.equals("D")) {
          count++;
        }
      }

      if (sum < count) {
        sum = Math.max(sum,count);
        ans = k;
      }
    }

    System.out.println(ans);
  }

}
