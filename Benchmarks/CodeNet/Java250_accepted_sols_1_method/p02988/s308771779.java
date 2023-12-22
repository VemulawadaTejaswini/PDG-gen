import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i = 0; i < n; i++){
		    x = y;
		    y = z;
		    z = sc.nextInt();
		    if(i > 1){
		        if(x < y && y < z) result++;
		        if(x > y && y > z) result++;
		    }
		}
		// 出力
		System.out.println(result);
		
	}
}
