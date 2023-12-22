import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "No";
		if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}

