import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    sc.nextLine();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (x >= a[i]) {
        ans++;
        x -= a[i];      
      }
    }
    if (n == ans && x > 0)
      ans--;
    System.out.println(ans);
  }
}