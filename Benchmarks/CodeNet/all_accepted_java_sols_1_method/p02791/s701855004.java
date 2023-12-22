import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int result = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
		    int now = sc.nextInt();
		    if(min > now){
		        result++;
		        min = now;
		    }
		}
		
		// 計算
		//int result = 0;
		
		// 出力
		System.out.println(result);
	}
}


