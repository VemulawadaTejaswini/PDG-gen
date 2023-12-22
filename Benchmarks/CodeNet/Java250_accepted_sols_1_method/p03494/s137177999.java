import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    int tmp = 0;
		    while(a%2 == 0){
		        tmp++;
		        a /= 2;
		    }
		    result = min(result, tmp);
		}
		
		// 計算
		
		// 出力
		System.out.println(result);
	}
}

