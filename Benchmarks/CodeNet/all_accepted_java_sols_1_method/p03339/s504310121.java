import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		int result = Integer.MAX_VALUE;
		int[] e = new int[n+1];
		for(int i = 0; i < n; i++){
		    if(s.charAt(i) == 'E'){
		        e[i+1] = e[i] + 1;
		    }else{
		        e[i+1] = e[i];
		    }
		}
		//System.out.println(Arrays.toString(e));
		for(int i = 1; i < n+1; i++){
		    int tmp = (e[n] - e[i]) + i-1 - e[i-1];
		    result = min(result, tmp);
		}
		
		// 出力
		System.out.println(result);
	}
}
