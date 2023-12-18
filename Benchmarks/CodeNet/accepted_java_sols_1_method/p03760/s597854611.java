import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] O = br.readLine().split("");
    String[] E = br.readLine().split("");
    String ans = "";
    for (int i = 0; i < O.length; i++) {
      ans += O[i];
      try {
        ans += E[i];
      } catch(Exception e) {}
    }
    System.out.println(ans);
  }
}
