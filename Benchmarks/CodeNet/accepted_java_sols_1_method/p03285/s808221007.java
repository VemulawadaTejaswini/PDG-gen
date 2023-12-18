import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    boolean flg = false;
    for(int i=0; i<=n/4; i++) {
      for(int j=0; j<=n/7; j++) {
        if((4*i+7*j)==n) {
          flg = true;
          break;
        }
      }
    }
    System.out.println(flg==true?"Yes":"No");
  }
}
