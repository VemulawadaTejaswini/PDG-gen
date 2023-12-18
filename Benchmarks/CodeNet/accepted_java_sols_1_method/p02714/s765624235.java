import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    long res = 0;
    long r = 0;
    long g = 0;
    long b = 0;
    for (int i = 0; i < n; i++) {
      char tmp = s.charAt(i);
      if (tmp == 'R') {
        r++;
      } else if (tmp == 'G') {
        g++;
      } else {
        b++;
      }
    }

    res = r*g*b;

    for (int i = 0; i < n-2; i++) {
      for (int j = i+1; 2*j-i < n; j++) {
        int k = 2*j-i;
        char first = s.charAt(i);
        char second = s.charAt(j);
        char third = s.charAt(k);
        if (first != second && second != third && third != first) res--;
      }
    }

    // for (int i = 0; i < n - 2; i++) {
    //   for (int j = i + 1; j < n - 1; j++) {
    //     char first = s.charAt(i);
    //     char second = s.charAt(j);
    //     if (first != second) {
    //       for (int k = j + 1; k < n; k++) {
    //         if (j - i == k - j) continue;
    //         char third = s.charAt(k);
    //         if (first != third && second != third) {
    //           res++;
    //         }
    //       }
    //     }
    //   }
    // }
    System.out.println(res);
    sc.close();
  }
}