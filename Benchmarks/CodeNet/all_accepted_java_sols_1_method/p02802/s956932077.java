import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] p = new int[m];
    String[] s = new String[m];

    int w = 0;
    int a = 0;

    int[] data = new int[100001];

    if (m != 0) {

      for (int i = 0; i < m; i++) {
        p[i] = sc.nextInt();
        s[i] = sc.next();
      }

      for (int i = 0; i < m; i++) {

        if (s[i].equals("WA") && data[p[i]]>=0) {

          data[p[i]]++;

        } else if (s[i].equals("AC") && data[p[i]]>=0) {

          a++;
          w += data[p[i]];
          data[p[i]] = -1;

        }
      }


    }

    System.out.println(a+" "+w);

  }


}
