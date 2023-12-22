import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static String s;
  static final long MOD = 2019L;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    s = br.readLine();

    br.close();

    n = s.length();

    Map<Long, Long> m = new HashMap<>();

    m.put(0L, 1L);

    long now = 0, ten = 1;

    for(int i = n-1; i >= 0; i--){
      now += ten * (long)(s.charAt(i) - '0');
      now %= MOD;

      m.put(now, m.getOrDefault(now, 0L) + 1L);

      ten *= 10;
      ten %= MOD;
    }

    long ans = 0;

    for(Map.Entry<Long, Long> e : m.entrySet()){
      ans += e.getValue() * (e.getValue() - 1) / 2;
    }

    System.out.println(ans);
    
  }
}