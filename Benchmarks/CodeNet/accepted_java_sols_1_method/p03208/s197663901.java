import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    int[] h = new int[n];
    for(int i=0; i<n; i++) {
      h[i] = Integer.parseInt(in.readLine());
    }
    
    Arrays.sort(h);
    
    int min = 1000000000;
    for(int i=0; i<n-k+1; i++) {
      min = Math.min(min,h[i+k-1]-h[i]);
    }
    System.out.println(min);
  }
}