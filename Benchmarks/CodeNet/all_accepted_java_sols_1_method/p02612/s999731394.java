import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      
		int ans = a % 1000;
        
          
        if (ans != 0) {
        	ans = 1000 - ans;
        }
		
		// 出力
		System.out.println(ans);
	}
}