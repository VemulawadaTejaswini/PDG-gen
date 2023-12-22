import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
    
		int sum = a + b;
        int sa = a - b;
        int seki = a * b;
        
        int ans = 0;
      
        if (sum > sa) {
          ans = sum > seki ? sum : seki;
        } else {
          ans = sa > seki ? sa : seki;
        }
    
		// 出力
		System.out.println(ans);
	}
}