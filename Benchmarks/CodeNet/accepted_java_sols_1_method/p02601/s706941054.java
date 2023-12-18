import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    String s = br.readLine();
    String[] sa = s.split(" ");
    int[] na = Stream.of(sa).mapToInt(Integer::parseInt).toArray();
    int k = Integer.parseInt(br.readLine());
    int cnt = 0;
    boolean sortFlg = true;

    while (sortFlg) {
      int sortCnt = 0;
      for (int i = 0; i + 1 < na.length; i++) {
        if (na[i] >= na[i + 1]) {
          na[i + 1] *= 2;
          cnt++;
          sortCnt++;
        }
      }
      if (sortCnt == 0) sortFlg = false;
    }

    if (cnt <= k) {
      out.println("Yes");
    } else {
      out.println("No");
    }
    out.close();
  }
}