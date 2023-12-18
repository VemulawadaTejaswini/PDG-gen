import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  static int n;
  static long ans;
  static List<Integer> a;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    in = br.readLine().split(" ");
    List<Integer> a = Arrays.stream(in).map(Integer::parseInt).collect(Collectors.toList());

    br.close();

    for (int i = 0; i < n; i+=2) {
      if(a.get(i) % 2 == 1) ans++;
    }

    out.println(ans);

    out.flush();
  }
}
