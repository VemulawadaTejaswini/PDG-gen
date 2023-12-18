import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    int[] W = new int[n+1];
    int[] E = new int[n+1];

    for (int i = 0; i < n; i++) {
      if (i >= 1) W[i+1] = W[i];
      if (c[i] == 'W') W[i+1]++;
    }

    for (int i = 0; i < n; i++) {
      if (i >= 1) E[i+1] = E[i];
      if (c[i] == 'E') E[i+1]++;
    }

    int min = 300000;

    for (int i = 0; i < n; i++) {
      int gap = W[i]+(E[n]-E[i+1]);
      if (gap < min) min = gap;
    }

    System.out.println(min);

  }

}
