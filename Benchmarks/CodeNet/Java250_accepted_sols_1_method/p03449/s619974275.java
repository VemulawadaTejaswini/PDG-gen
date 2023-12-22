import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[][] list = new int[2][n];
        
        for (int i = 0; i < 2; i++) {
          for (int index = 0; index < n; index++) {
                list[i][index] = sc.nextInt();
             }
        }
      
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
          int sum = 0;
          for (int index = 0; index < n + 1; index++) {
            int add = 0;
            if (i == 0 && index == 0) {
              add = list[0][0];
            } else {
              add = index >= i ? list[1][index - 1] : list[0][index];
            }
      
            sum += add;
          }

          if (sum > ans) {
            ans = sum;
          }
        }
        
		// 出力
		System.out.println(ans);
	}
}