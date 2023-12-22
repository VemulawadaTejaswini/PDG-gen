import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    
    String[] str = in.readLine().split(" ");
    int t = Integer.parseInt(str[0]);
    int a = Integer.parseInt(str[1]);

    int[] h = new int[n];
    str = in.readLine().split(" ");
    double diffMin = 10000000;
    int diffMinPoint = 0;
    for(int i=0; i<n; i++) {
      h[i] = Integer.parseInt(str[i]);
      double point = t-h[i]*0.006;
      if(diffMin > Math.abs(point-a)) {
        diffMin = Math.abs(point-a);
        diffMinPoint = i+1;
      }
    }
    
    System.out.println(diffMinPoint);
  }
}
    