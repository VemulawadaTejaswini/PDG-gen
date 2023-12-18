import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		String result = "";
		n = n%26;
		for(int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);
		    int d = (c - 'A' + n)%26;
		    char e = (char)(d + 'A');
		    System.out.print(e);
		}
		
		// 出力
		//System.out.println(result);
	}
	
}
