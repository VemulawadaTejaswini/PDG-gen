import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		int result = 1;
		for(int i = 0; i < n; i++){
		    if(result*2 > result + k){
		        result += k;
		    }else{
		        result *= 2;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

