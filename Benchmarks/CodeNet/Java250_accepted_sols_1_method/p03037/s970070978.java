import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 計算
		int maxL = 0;
		int minR = Integer.MAX_VALUE;
		for(int i = 0; i < m; i++){
		    maxL = max(maxL, sc.nextInt());
		    minR = min(minR, sc.nextInt());
		}
		int result = max(0, minR - maxL + 1);

		// 出力
		System.out.println(result);
	}
}