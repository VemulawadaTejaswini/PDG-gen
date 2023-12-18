
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < Math.min(k, 50); i++) {
      int[] rui = new int[n];
      for(int j = 0; j < n; j++) {
        int s = j - a[j];
        int t = j + a[j] + 1;
        if(s >= 0) {
          rui[s]++;
        } else {
          rui[0]++;
        }
        if(t >= n) {
          
        } else {
          rui[t]--;
        }
      }
      for(int j = 1; j < n; j++) {
        rui[j] += rui[j - 1];  
      }
      a = rui;
    }
    for(int i = 0; i < n; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
  }
}