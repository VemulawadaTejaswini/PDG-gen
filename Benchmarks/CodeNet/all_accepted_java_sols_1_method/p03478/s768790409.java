import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int result = 0;
		for(int i = 1; i < n+1; i++){
		    int temp = 0;
		    String s = Integer.toString(i);
		    for(int j = 0; j < s.length(); j++){
		        temp += s.charAt(j) - '0';
		    }
		    if(a <= temp && temp <= b) result += i;
		}
		
		// 出力
		System.out.println(result);
	}
}

