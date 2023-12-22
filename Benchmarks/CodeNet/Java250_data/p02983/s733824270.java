import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int l = sc.nextInt();
		int r = sc.nextInt();

		// 計算
		int result = Integer.MAX_VALUE;
		for(int i = l; i < min(l + 2019, r + 1); i++){
		    for(int j = i + 1; j < min(l + 2019, r + 1); j++){
		        result = min(result, ((i%2019)*(j%2019))%2019);
		    }
		}

		// 出力
		System.out.println(result);
	}
}
