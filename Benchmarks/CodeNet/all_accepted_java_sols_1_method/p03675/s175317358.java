import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int[] ord = new int[1000000];
    for(int i = 0; i < 1000000; i++) {
      ord[i] = -1;
    }
    int first = 500000;
    if(n % 2 == 0) {
      int last = first + 1;
      ord[first] = 1;
      ord[last] = 0;
      for(int i = 0; i < (n - 2) / 2; i++) {
        first--;
        last++;
        ord[first] = 2 * (i + 1) + 1;
        ord[last] = 2 * (i + 1); 
      }
    } else {
      int last = first;
      ord[first] = 0;
      ord[last] = 0;
      for(int i = 0; i < (n - 1) / 2; i++) {
        first--;
        last++;
        ord[first] = 2 * (i + 1);
        ord[last] = 2 * (i + 1) - 1; 
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.print(a[ord[first + i]]);
      if(i < n - 1) System.out.print(" ");
    }
  }
}