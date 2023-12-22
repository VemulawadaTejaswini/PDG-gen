import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    int ans = 0;
    for(int i=x; i<10000000; i++) {
      boolean hantei = false;
      for(int j=2; j<i; j++) {
        if(i%j==0) {
          hantei = true;
          break;
        }
      }
      if(hantei == false) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}