import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		
		// 計算
		long result = 0L;
		long sumA = 0L;
		if(a%4 == 0) sumA = a;
		if(a%4 == 1) sumA = 1L;
		if(a%4 == 2) sumA = a + 1;
		if(a%4 == 3) sumA = 0L;
		long sumB = 0L;
		if(b%4 == 0) sumB = b;
		if(b%4 == 1) sumB = 1L;
		if(b%4 == 2) sumB = b + 1;
		if(b%4 == 3) sumB = 0L;
		result = sumA^sumB;
		
		// 出力
		System.out.println(result);
        
	}
}
