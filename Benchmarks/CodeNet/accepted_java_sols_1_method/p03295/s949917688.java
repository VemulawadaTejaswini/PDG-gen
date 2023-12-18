import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[m][2];
		for(int i = 0; i < m; i++){
		    ab[i][0] = sc.nextInt();
		    ab[i][1] = sc.nextInt();
		}
		Arrays.sort(ab, (s, t) -> Integer.compare(s[1], t[1]));
		
		// 計算
		int result = 0;
		int now = 0;
		for(int i = 0; i < m; i++){
		    if(now < ab[i][0]){
		        result++;
		        now = ab[i][1] - 1;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
