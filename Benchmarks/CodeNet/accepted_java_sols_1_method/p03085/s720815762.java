import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		char b = s.charAt(0);
		
		// 計算
		char result = ' ';
		
		if(b == 'A') result = 'T';
		if(b == 'T') result = 'A';
		if(b == 'C') result = 'G';
		if(b == 'G') result = 'C';
		
		// 出力
		System.out.println(result);
        
	}
}
