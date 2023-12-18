import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
		    int c_i = sc.nextInt();
		    int t_i = sc.nextInt();
		    if(t_i <= t){
		        min = min(min, c_i);
		    }
		}

		
		// 計算
		int result = min;
		
		// 出力
		if(result == Integer.MAX_VALUE){
		    System.out.println("TLE");
		}else{
		    System.out.println(result);
		}
		
	}
}