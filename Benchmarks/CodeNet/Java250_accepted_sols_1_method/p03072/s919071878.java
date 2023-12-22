import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] h = new int[n];
    int cnt = n;
    
    for(int i=0; i<n; i++) {
      h[i] = Integer.parseInt(str[i]);
     }
    for(int i=1; i<n; i++) {
      int tmp_cnt = 0;
      for(int j=0; j<i; j++) {
        if(h[i]<h[j])
          tmp_cnt += 1;
      }
      if(tmp_cnt>0){
        cnt -= 1;
      }
    }
    
    System.out.println(cnt);
  }
}