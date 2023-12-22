import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String n = sc.next();
		
		// 計算
		
		// 出力
		for(int i = 0; i < n.length(); i++){
		    if(n.charAt(i) == '1' ) System.out.print(9);
		    if(n.charAt(i) == '9' ) System.out.print(1);
		}
		
		
	}
}