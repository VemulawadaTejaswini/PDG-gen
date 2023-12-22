import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();

		// 計算
		String result = "No";
		String[] c = s.split("");
		Arrays.sort(c);
		if(c[0].equals(c[1]) && !c[1].equals(c[2]) && c[2].equals(c[3])) result = "Yes";

		// 出力
		System.out.println(result);
		
	}
}
