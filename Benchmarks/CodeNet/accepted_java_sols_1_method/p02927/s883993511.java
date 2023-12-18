import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int m = sc.nextInt();
		int d = sc.nextInt();
      
        int ans = 0;
        for(int month = 4; month <= m; month++) {
          for (int day = 22; day <= d; day++) {
            int d1 = day % 10;
            int d10 = (day - d1) / 10;
            if (d1 < 2) {
              continue;
            }
            if (d1 * d10 == month) {
              ans++;
            }
          }
        }

      
		// 出力
		System.out.println(ans);
	}
}