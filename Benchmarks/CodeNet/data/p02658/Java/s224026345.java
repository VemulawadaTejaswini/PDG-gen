import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		// 整数の数
		int N = scan.nextInt();
 
		BigInteger ans = BigInteger.ONE;
 
		List<Long>  list = new ArrayList();
 
		for(int i = 0; i < N; i++) {
			list.add(scan.nextLong());
		}
 
		// ansに掛け算の結果
		for(int i = 0; i < list.size(); i++) {
			ans = ans.multiply(BigInteger.valueOf(list.get(i)));
		}
 
		//9223372036854775807
 
		//18446744073709551616
      	
		//System.out.println(ans.toString().length() );
		if(ans.toString().length() > 18 ) {
			System.out.println(-1);
		}else {
			System.out.println(ans.longValue());
		}
 
	}
 
}