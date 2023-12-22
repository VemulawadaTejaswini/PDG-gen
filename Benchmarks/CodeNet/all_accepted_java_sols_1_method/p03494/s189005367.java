import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int[] a = new int[n];
      for(int i = 0; i < n ; i++) {
        a[i] = sc.nextInt();
      }
      
      int cnt = 0;
      boolean flg = false;
      while(true) {
        for(int i = 0; i < n; i++) {
          if(a[i] % 2  != 0) {
            flg = true;
          } else {
            a[i] /= 2;
          }
        }
        if(flg) {
          break;
        }else {
          cnt++;
          flg = false;
        }
      }

      System.out.println(cnt);

	}
}