import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 計算
		int result = 0;
		if(b%a == 0){
		    result = a + b;
		}else{
		    result = b -a;
		}
		
		// 出力
		System.out.println(result);
        
	}
}
