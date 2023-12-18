import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long answer = 0;
    int n = Integer.parseInt(br.readLine());
    int[][] div2div5cnt = new int[19][19];
    long[] pow10 = new long[10];
    pow10[0] = 1;
    for(int i = 1; i < 10; i++){
      pow10[i] = pow10[i - 1] * 10;
    }
    for(int i = 0; i < n; i++){
      int div5cnt = 0;
      int div2cnt = 0;
      String a = br.readLine();
      int idx = a.indexOf('.');
      long num = 0;
      if(idx > 0){
        num = Long.parseLong(a.replace(".", "")) * pow10[9 - (a.length() - idx - 1)];
      } else {
        num = Long.parseLong(a) * pow10[9];
      }
      while(num % 5 == 0){
        div5cnt++;
        num /= 5;
      }
      while(num % 2 == 0){
        div2cnt++;
        num /= 2;
      }
      div2div5cnt[Math.min(div2cnt, 18)][Math.min(div5cnt, 18)]++;
    }
    for(int div2a = 0; div2a <= 18; div2a++){
      for(int div5a = 0; div5a <= 18 ; div5a++){
        for(int div2b = 18 - div2a; div2b <= 18; div2b++){
          for(int div5b = 18 - div5a; div5b <= 18; div5b++){
            if(div2a == div2b && div5a == div5b) {
              answer += (div2div5cnt[div2a][div5a] * (div2div5cnt[div2b][div5b] - 1));
            } else {
              answer += (div2div5cnt[div2a][div5a] * div2div5cnt[div2b][div5b]);
            }
          }
        }
      }
    }
    System.out.println(answer / 2);
  }
}