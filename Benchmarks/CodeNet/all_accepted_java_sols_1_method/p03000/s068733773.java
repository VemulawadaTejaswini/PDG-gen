import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int x = Integer.parseInt(str[1]);
    int[] l = new int[n];
    int[] d = new int[n+1];
    int count = 0;
    str = in.readLine().split(" ");
    d[0] = 0;
    for(int i=0; i<n; i++) {
      l[i] = Integer.parseInt(str[i]);
      d[i+1] = d[i] + l[i];
    }
    for(int j=0; j<=n; j++) {
      if(d[j]<=x)
        count+=1;
    }
    System.out.println(count);
  }
}