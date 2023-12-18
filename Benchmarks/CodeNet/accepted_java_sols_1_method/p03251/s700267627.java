import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int X = Integer.parseInt(str[2]);
    int Y = Integer.parseInt(str[3]);
    if(X>=Y) {
      System.out.println("War");
      return;
    }
    
    str = in.readLine().split(" ");
    int[] x = new int[n+1];
    x[0] = X;
    for(int i=1; i<=n; i++) {
      x[i] = Integer.parseInt(str[i-1]);
    }
    Arrays.parallelSort(x);
    
    str = in.readLine().split(" ");
    int[] y = new int[m+1];
    y[0] = Y;
    for(int i=1; i<=m; i++) {
      y[i] = Integer.parseInt(str[i-1]);
    }
    Arrays.parallelSort(y);
    
    if(x[n]>=y[0]) {
      System.out.println("War");
      return;
    }
    
    System.out.println("No War");
  }
}