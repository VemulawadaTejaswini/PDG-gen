import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in;
    in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);

    in = br.readLine().split(" ");
    long[] a = Stream.of(in).mapToLong(Long::parseLong).toArray();

    br.close();

    Map<Long, Long> m = new HashMap<>();

    for(int i = 0; i < n; i++){
      m.put(a[i], m.getOrDefault(a[i], 0L) + 1L);
    }

    long ans = 0;

    for(Map.Entry<Long, Long> e : m.entrySet()){
      ans += e.getValue() * (e.getValue() - 1) / 2;
    }

    for(int i = 0; i < n; i++){
      System.out.println(ans - m.get(a[i]) + 1);
    }
    
  }
}