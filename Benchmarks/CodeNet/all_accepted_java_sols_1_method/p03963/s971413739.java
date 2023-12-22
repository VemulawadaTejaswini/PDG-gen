import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
      
        int ans = 1;
        
        for (int i = 0; i < n; i++) {
            ans *= i == 0 ? k : k -1;
        }
    
		// 出力
		System.out.println(ans);
	}
}