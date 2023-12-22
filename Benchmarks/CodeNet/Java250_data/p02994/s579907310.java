import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		// 計算
		int result = 0;
		int skip = 0;
		if(l >= 0){
		    skip = 1;
		}else if(l + n - 1 <= 0 ){
		    skip = n;
		}else{
		    skip = 0;
		}
		for(int i = 1; i <= n; i++){
		    if(i == skip) continue;
		    result += l + i - 1;
		}

		// 出力
		System.out.println(result);
		
	}
}
