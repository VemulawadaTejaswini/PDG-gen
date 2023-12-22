import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int n = s.length();
    String s_bf = s.substring(0,n/2);
    String s_af = s.substring(n/2,n);
    StringBuffer s_af_sb = new StringBuffer(s_af);
    String s_af_rev = s_af_sb.reverse().toString();
    int cnt = 0;
    for(int i = 0; i<n/2; i++) {
      if(s_bf.charAt(i) != s_af_rev.charAt(i)){
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}