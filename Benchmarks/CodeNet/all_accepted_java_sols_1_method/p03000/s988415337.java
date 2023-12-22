import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int x = sc.nextInt();
			
		// 計算
		int result = 1;
		int y = 0;
		for(int i = 0; i < n; i++){
		    y += sc.nextInt();
		    if(y > x) break;
		    result++;
		}
		
		// 出力
		System.out.println(result);
		
	}
}
