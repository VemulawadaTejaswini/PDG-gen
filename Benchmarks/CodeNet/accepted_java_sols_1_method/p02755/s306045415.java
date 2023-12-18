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
		int result = -1;
		for(int i = 0; i <= 11000; i++){
		    if(a == floor(0.08*i) && b == floor(0.1*i)){
		        result = i;
		        break;
		    }
		}
		
		
		// 出力
		System.out.println(result);
	}
}
