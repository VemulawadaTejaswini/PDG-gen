import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();

    int[] ten = new int[n+1];
    ten[0] = 1;

    for (int i = 1; i < n+1; i++) {
      ten[i] = (ten[i-1]*10)%2019;
    }

    int[] data = new int[n+1];

    for (int i = 1; i <= n; i++) {
      data[i] = (data[i-1]+Integer.parseInt(s.substring(n-i,n-i+1))*ten[i-1])%2019;
    }

    int[] res = new int[2019];

    for (int i = 0; i <= n; i++) {
      int k = data[i]%2019;
      res[k]++;
    }

    int ans = 0;

    for (int i = 0; i < 2019; i++) {
      ans += res[i]*(res[i]-1)/2;
    }

    System.out.println(ans);

  }

}
