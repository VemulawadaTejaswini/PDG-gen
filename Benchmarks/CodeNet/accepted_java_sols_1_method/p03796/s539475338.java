import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        long value = 1;
        long modConst = 1000000007;
      
        for (int i = 1; i <= n; i++) {
            value *= i;
            value %= modConst;
        }
    
		// 出力
		System.out.println(value);
	}
}