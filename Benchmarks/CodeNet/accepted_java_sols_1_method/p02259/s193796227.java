import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int count = 0;
    int v;
    for(int i = 0; i < n - 1; i++) {
      for(int j = n - 1; j > i; j--) {
        if(a[j - 1] > a[j]) {
          v = a[j];
          a[j] = a[j - 1];
          a[j - 1] = v;
          count++;
        }
      }
    }
    for(int i = 0; i < n; i++) {
      if(i == n - 1) {
        System.out.println(a[i]);
      } else {
        System.out.print(a[i] + " ");
      }
    }
    System.out.println(count);
  }
}

