import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		
		// 計算
	    String result = "NO";
	    if(x == 7 || x == 5 || x == 3) result = "YES";

		// 出力
		System.out.println(result);
        
	}
}