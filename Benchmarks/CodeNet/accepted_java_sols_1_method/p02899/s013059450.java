import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    for(int i = 0; i < n; i++) {
      a[Integer.parseInt(sc.next())-1] = i+1;
    }
    for(int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}