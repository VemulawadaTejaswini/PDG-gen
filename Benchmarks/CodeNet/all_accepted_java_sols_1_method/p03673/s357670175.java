import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for (int i =0; i<n; i++) {
      a[i] = sc.nextLong();
    }
    for (int i =n-1; i >=0; i -=2) {
      System.out.print(a[i] + " ");
    }
    if (n % 2 == 0) {
      for (int i =0; i <n-1; i +=2) {
        System.out.print(a[i] + " ");
      }
    } else {
      for (int i =1; i <n-1; i +=2) {
        System.out.print(a[i] + " ");
      }
    }
  }
}