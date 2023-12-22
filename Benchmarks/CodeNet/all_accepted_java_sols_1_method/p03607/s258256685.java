import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i = 0; i < n; i++) a[i] = Integer.parseInt(sc.next());
    Arrays.sort(a);
    int ans = 0;
    int temp, count;
    for(int i = 0; i < n; i++) {
      temp = a[i];
      count = 0;
      while(i < n && temp == a[i]) {
        count++;
        i++;
      }
      i--;
      ans += (count % 2);
    }
    System.out.println(ans);
  }
}
