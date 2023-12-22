import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    String t = br.readLine();
    br.close();
    int s_len = s.length();
    int t_len = t.length();
    int answer = t.length();
    for(int s_idx = 0; s_idx <= s_len - t_len; s_idx++){
      int diff_cnt = 0;
      for(int t_idx = 0; t_idx < t_len; t_idx++){
        if(s.charAt(s_idx + t_idx) != t.charAt(t_idx)) diff_cnt++;
      }
      answer = Math.min(answer, diff_cnt);
    }
    System.out.println(answer);
  }
}