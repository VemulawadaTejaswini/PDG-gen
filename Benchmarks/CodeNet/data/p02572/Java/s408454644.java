import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int n = sc.nextInt();
      long a[] = new long[n];
      for(int i = 0; i < n; i++)
      {
          a[i] = sc.nextLong();
      }
      long suf_sum[] = new long[n+1];
      long Mod = (long)1e9+7;
      //w.println(Mod);
      for(int i = n-1; i > 0; i--)
      {
          suf_sum[i] = (suf_sum[i+1] + a[i]) % Mod;    
      }
      long ans = 0;
      for(int i = 0; i < n-1; i++)
      {
          ans += (a[i]*suf_sum[i+1]) % Mod;
          ans %= Mod;
      }
      w.println(ans);
      w.close();
    }
}