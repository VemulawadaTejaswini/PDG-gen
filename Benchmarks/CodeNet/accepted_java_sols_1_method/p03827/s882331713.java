import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
    
		// 文字列の入力
		String[] s = sc.next().split("");
        int ans = 0;
        int count = 0;
    
        for(int i = 0; i < n; i++) {
          if (s[i].equals("I")) {
            count++;
          } else {
            if (count > ans) {
              ans = count;
            }
            count--;
          }
          if (i == n - 1) {
            if (count > ans) {
              ans = count;
            }
          }
        }
        
		// 出力
		System.out.println(ans);
	}
}