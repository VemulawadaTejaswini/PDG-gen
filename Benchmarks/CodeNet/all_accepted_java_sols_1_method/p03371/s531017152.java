import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		// 計算
		int result = 0;
		if(a + b <= 2*c){
		    result = a*x + b*y;
		}else{
		    int c_cnt = min(x, y);
		    result += c*c_cnt*2;
		    int r_cnt = max(x, y) - c_cnt;
		    int r_price = a;
		    if(x < y) r_price = b;
		    if(r_price < 2*c){
		        result += r_cnt * r_price;
		    }else{
		        result += r_cnt * 2 * c;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

