import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

  static int n;
  static long ans;
  static List<Integer> a;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    br.close();

    //n = 10000;
    int rtn = 100;

    a = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      int tmp = 0;
      for (int x = 1; x <= rtn; x++) {
        if(x * x > i) break;
        for (int y = x; y <= rtn; y++) {
          if(x * x + y * y > i) break;
          for (int z = y; z <= rtn; z++) {
            if(x * x + y * y + z * z > i) break;
            int result = x * x + y * y + z * z + x * y + y * z + z * x;
            if(result == i) {
              if(x == y && y == z){
                tmp++;
              }else if(x == y || y == z || z == x){
                tmp += 3;
              }else{
                tmp += 6;
              }
            }
          }
        }
      }
      a.add(tmp);
    }

    a.stream().forEach(out::println);

    out.flush();
  }
}