import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int x = Integer.parseInt(str[2]);
    String[] a = in.readLine().split(" ");
    int count = 0;
    for(int i=0; i<m; i++) {
      if(x<Integer.parseInt(a[i]))
        count++;
    }
    System.out.println(Math.min(count,m-count));
  }
}