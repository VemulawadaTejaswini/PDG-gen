import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int k = s.nextInt();
//    System.out.println(n - k);
//    System.out.println((n - k) / (k - 1));
//    System.out.println((n - k) % (k - 1) > 0 ? 1 : 0);
    System.out.println(
      1 + 
      ((n - k) / (k - 1)) + 
      (((n - k) % (k - 1)) > 0 ? 1 : 0)
    );
/*
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }

    int minIndex = -1;
    for (int i = 0; i < n; i++) {
      if (a[i] == 1) {
        minIndex = i;
        break;
      }
    }
*/
    
  }
}
