import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long answer = 0;
    int n = Integer.parseInt(br.readLine());
    int[] div2cnt = new int[n];
    int[] div5cnt = new int[n];
    long[] pow10 = new long[10];
    pow10[0] = 1;
    for(int i = 1; i < 10; i++){
      pow10[i] = pow10[i - 1] * 10;
    }
    for(int i = 0; i < n; i++){
      String a = br.readLine();
      int idx = a.indexOf('.');
      long num = 0;
      if(idx > 0){
        num = Long.parseLong(a.replace(".", "")) * pow10[9 - (a.length() - idx - 1)];
      } else {
        num = Long.parseLong(a) * pow10[9];
      }
      while(num % 5 == 0){
        div5cnt[i]++;
        num /= 5;
      }
      while(num % 2 == 0){
        div2cnt[i]++;
        num /= 2;
      }
    }
    for(int i = 0; i < n - 1; i++){
      for(int j = i + 1; j < n; j++){
        if(Math.min(div2cnt[i] + div2cnt[j], div5cnt[i] + div5cnt[j]) >= 18){
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}