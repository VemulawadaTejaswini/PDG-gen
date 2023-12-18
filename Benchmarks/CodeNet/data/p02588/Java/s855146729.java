import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    long answer = 0;
    int n = Integer.parseInt(sc.readLine());
    long[] nums = new long[n];
    int[] digits = new int[n];
    long[] mods = new long[19];
    mods[0] = 1;
    for(int i = 1; i < 19; i++){
      mods[i] = mods[i - 1] * 10;
    }
    for(int i = 0; i < n; i++){
      String a = sc.readLine();
      int idx = a.indexOf('.');
      if(idx > 0){
        digits[i] = a.replaceAll("0+$", "").length() - idx - 1;
        nums[i] = Long.parseLong(a.replaceAll("0+$", "").replace(".", ""));
      } else {
        digits[i] = 0;
        nums[i] = Long.parseLong(a);
      }
    }
    for(int i = 0; i < n - 1; i++){
      for(int j = i + 1; j < n; j++){
        if(digits[j] == 0 && digits[i] == 0) {
          answer++;
          continue;
        }
        int digit = digits[i] + digits[j];
        long n1 = nums[i] % mods[digit];
        long n2 = nums[j] % mods[digit];
        if((n1 * n2) % mods[digit] == 0){
          answer++;
          continue;
        }
      }
    }
    System.out.println(answer);
  }
}