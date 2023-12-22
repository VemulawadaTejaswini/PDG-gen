import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		String result = "0";
		StringBuilder sb = new StringBuilder();
		while(n != 1 && n != 0){
		    if(n > 0){
		        int m = n;
		        n /= -2;
		        sb.append(m-n*(-2));
		    }else{
		        int m = n;
		        n = (n-1)/(-2);
		        sb.append(m-n*(-2));
		    }
		}
		sb.append(1);
		if(n != 0) result = sb.reverse().toString();
		
		// 出力
		System.out.println(result);
	}
}
