import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    // w = x - y
    int max_w = Integer.MIN_VALUE;
    int min_w = Integer.MAX_VALUE;
    // v = x + y
    int max_v = Integer.MIN_VALUE;
    int min_v = Integer.MAX_VALUE;
    for(int i = 0; i < n; i++){
      String[] data = br.readLine().split(" ");
      int x = Integer.parseInt(data[0]);
      int y = Integer.parseInt(data[1]);
      max_w = Math.max(max_w, x - y);
      min_w = Math.min(min_w, x - y);
      max_v = Math.max(max_v, x + y);
      min_v = Math.min(min_v, x + y);
    }
    br.close();
    System.out.println(Math.max(Math.abs(max_w - min_w), Math.abs(max_v - min_v)));
  }
}