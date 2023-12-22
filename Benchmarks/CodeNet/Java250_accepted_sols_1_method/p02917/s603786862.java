import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] b = new int[n-1];

		int result = 0;
		int pre = 0;
		for(int i = 0; i < n - 1; i++){
		    b[i] = sc.nextInt();
		    if(i == 0) result = result + b[i];
		    if(i > 0){
		        result = result + min(pre, b[i]);
		    }
		    if(i == n - 2) result = result + b[i];
		    pre = b[i];
		}

		// 計算

		// 出力
		System.out.println(result);
	}
}
