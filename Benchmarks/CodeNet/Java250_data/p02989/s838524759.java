import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] d = new int[n];
    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      d[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(d);
    System.out.println(d[n/2]-d[n/2-1]);
  }
}