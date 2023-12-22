import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		String result = "No";
		int i = n;
		int x = 0;
		while(i > 0){
		    x += i%10;
		    i /= 10;
		}
		if(n%x == 0) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}
