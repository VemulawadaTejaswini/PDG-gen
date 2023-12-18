import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    final int MAX = 100001;
    int[] a = new int[n];
    int[] number = new int[MAX];
    for(int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
      if(a[i] != 0) number[a[i]-1]++;
      number[a[i]]++;
      if(a[i] != MAX) number[a[i]+1]++;
    }
    int ans = 0;
    for(int i = 0; i < MAX; i++) {
      ans = Math.max(ans, number[i]);
    }
    System.out.println(ans);
  }
}
