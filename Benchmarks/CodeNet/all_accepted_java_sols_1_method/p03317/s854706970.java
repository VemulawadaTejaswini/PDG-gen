import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      int idx = -1;
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if(arr[i] == 1) idx = i;
      }

      int cnt = 0;
      int i = 0;
      while(i < n - 1) {
        cnt++;
        i = i + k - 1;
      }
     
      int cnt2 = 0;
      i = idx;
      while(i > 0) {
        cnt2++;
        i = i - k + 1;
      }
      i = idx;
      while(i < n-1) {
        i = i + k - 1;
        cnt2++;
      }
      System.out.println(Math.min(cnt, cnt2));
  }
}