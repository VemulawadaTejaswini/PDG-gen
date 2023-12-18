import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		long cap = 1001001001001001001L;
		for(int i = 0; i < 5; i++){
		    cap = min(cap, sc.nextLong());
		}
		
		// 計算
		long result = 0;
		result = (n + cap - 1)/cap + 4;
		
		// 出力
		System.out.println(result);
        
	}
}