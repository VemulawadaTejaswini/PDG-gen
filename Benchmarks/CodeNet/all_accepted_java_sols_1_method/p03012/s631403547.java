import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] w = new int[n];
    int min = 1000000000;
    int s = 0;
    int t = 0;
    
    for(int i=0; i<n; i++) {
      w[i] = Integer.parseInt(str[i]);
      t+=w[i];
    }

    for(int i=0; i<n; i++) {
      min = Math.min(min,Math.abs(s-t));
      t -= w[i];
      s += w[i];
    }
    System.out.println(min);
  }
}