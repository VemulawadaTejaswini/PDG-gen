import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    int day = 1;
		    while(day <= d){
		        sum++;
		        day += a;
		    }
		}
		
		// 計算
		int result = x + sum;
		
		// 出力
		System.out.println(result);
		
	}
}


