import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int w = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int list[] = new int[w];

    for (int i = 0; i < w; i++) {
      list[i] = i + 1;
    }

    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      int a = (Integer.parseInt(s.split(",")[0])-1);
      int b = (Integer.parseInt(s.split(",")[1])-1);

      int t = list[a];
      list[a] = list[b];
      list[b] = t;
    }

    for (int i = 0; i < w; i++) {
      System.out.println(list[i]);
    }
  }
}