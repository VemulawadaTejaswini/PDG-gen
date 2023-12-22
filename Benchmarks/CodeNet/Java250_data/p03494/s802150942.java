import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

      int cnt = 0;
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if(arr[i] % 2 == 0) cnt++;
        else break;
      }
      int times = 0;
      while(cnt == n) {
        cnt = 0;
        for(int i = 0; i < n; i++) {
          if(arr[i] % 2 == 0) { 
            arr[i] /= 2;
            cnt++;
          } else break;
        }
        if(cnt == n)
          times++;
      }
      System.out.println(times);
  }
}