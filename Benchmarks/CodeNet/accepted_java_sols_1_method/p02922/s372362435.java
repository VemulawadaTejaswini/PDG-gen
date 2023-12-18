import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        if (b == 1) {
          // 出力
		  System.out.println(0);
        } else {
          int sum = a;
          int ans = 1;
          while(sum < b) {
            sum += a - 1;
            ans++;
          }
    
		// 出力
		System.out.println(ans);
        }
        
	}
}