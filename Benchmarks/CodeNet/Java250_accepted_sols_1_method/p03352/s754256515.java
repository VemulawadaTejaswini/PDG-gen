import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		
		// 計算
		int result = 1;
		for(int i = 1; i <= x; i++){
		    for(int j = 2; j <= x; j++){
		        if((int)pow(i, j) <= x) result = max(result, (int)pow(i, j));
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
