import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int cnt = 0;
    for(int i=1; i<=n; i+=2) {
        int tmp_cnt = 0;
      for(int j=1; j<=i; j++){
        if(i%j==0) {
          tmp_cnt += 1;
        }
      }
      if(tmp_cnt == 8) {
        cnt+=1;
      }
    }
    System.out.println(cnt);
  }
}