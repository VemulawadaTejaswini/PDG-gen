import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] t = new int[n];
		for(int i = 0; i < n; i++){
		    s[i] = sc.next();
		    t[i] = sc.nextInt();
		}
		String x = sc.next();
		
		// 計算
		int result = 0;
		int index = 0;
		for(int i = 0; i < n; i++){
		    if(s[i].equals(x)) index = i;
		}
		for(int i = index + 1; i < n; i++){
		    result += t[i];
		}
		
		// 出力
		System.out.println(result);
	}
	
}


