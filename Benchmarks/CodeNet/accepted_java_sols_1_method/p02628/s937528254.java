import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  static int n, k, ans;
  static List<Integer> p;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    k = Integer.parseInt(in[1]);

    in = br.readLine().split(" ");
    p = Arrays.stream(in).map(Integer::parseInt).sorted().collect(Collectors.toList());

    br.close();

    for (int i = 0; i < k; i++) {
      ans += p.get(i);
    }
    out.println(ans);

    out.flush();
  }
}
