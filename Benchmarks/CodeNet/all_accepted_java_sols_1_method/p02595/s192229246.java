import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int ans = 0;
    int n = Integer.parseInt(head[0]);
    long d = Long.parseLong(head[1]);
    long d2 = d * d;
    for(int i = 0; i < n; i++){
      String[] data = br.readLine().split(" ");
      long x = Long.parseLong(data[0]);
      long y = Long.parseLong(data[1]);
      if(d2 >= (x * x) + (y * y)){
        ans++;
      }
    }
    br.close();
    System.out.println(ans);
  }
}