import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] xl = new int[n][2];
		for(int i = 0; i < n; i++){
		    xl[i][0] = sc.nextInt();
		    xl[i][1] = sc.nextInt();
		}
		Arrays.sort(xl, (a, b) -> Integer.compare(a[0]+a[1], b[0]+b[1]));
		//System.out.println(Arrays.deepToString(xl));
		
		// 計算
		int result = n;
		int r = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
		    int l = xl[i][0] - xl[i][1];
		    if(l < r){
		        result--;
		    }else{
		        r = xl[i][0] + xl[i][1];
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}


