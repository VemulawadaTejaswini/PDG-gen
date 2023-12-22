import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String result = "Three";
		for(int i = 0; i < n; i++){
		    String s = sc.next();
		    if(s.equals("Y")) result = "Four";
		}
		
		// 計算
		
		// 出力
		System.out.println(result);
	}
}


