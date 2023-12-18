import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
     
      long[] h = new long[n];
      for(int i = 0; i < n; i++) {
		h[i] = sc.nextLong();
      }
            
      boolean flg = true;
      for(int i = 0; i < n-1; i++) {
        if(h[i] - h[i+1] >= 2) {
          flg = false;
          break;

        } else if((h[i] - h[i+1]) == 1) {
          h[i]--;
          if(i != 0) {
            if(h[i-1] <= h[i]) {
              // 何もしない
            } else {
              flg = false;
              break;
            }
          }

        } else if ((h[i] - h[i+1]) == 0) {
          if(i != 0) {
            if(h[i-1] == h[i]) {
              // 何もしない
            } else {
              h[i]--;
            }
          } else {
            h[i]--;
          }
        } else if(h[i] - h[i+1] < 0)  {
          // 何もしない
        }
      }

      if(flg) {
        System.out.println("Yes");
      }else {
        System.out.println("No");
        
      }
    }
}
