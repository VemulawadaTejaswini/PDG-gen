import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] score = new int[n];
    int sum = 0;
    for(int i = 0; i < n; i++) {
      score[i] = Integer.parseInt(sc.next());
      sum += score[i];
    }
    int ans = sum;
    if(sum % 10 == 0) {
      int min = 101;
      for(int i = 0; i < n; i++) {
        if(score[i] % 10 != 0 && min > score[i]) {
          min = score[i];
        }
      }
      if(min == 101) ans = 0;
      else ans = sum - min;
    }
    System.out.println(ans);
  }
}
