import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    int ans = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      l[cnt] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        for (int k = 0; k < j; k++) {
          int[] tmpl = { l[i], l[j], l[k] };
          if( tmpl[0] == tmpl[1]) continue;
          if( tmpl[1] == tmpl[2]) continue;
          if( tmpl[2] == tmpl[0]) continue;
          Arrays.sort(tmpl);
          if (tmpl[2] < tmpl[0] + tmpl[1]) {
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
    sc.close();
  }
}