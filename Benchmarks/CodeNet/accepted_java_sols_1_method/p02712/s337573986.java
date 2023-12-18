import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		long result = 0;
		for(long i = 1; i <= n; i++){
		    if(i%3 != 0 && i%5 != 0) result += i;
		}
		
		// 出力
		System.out.println(result);
	}
}

