import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "No";
		if(s.charAt(0) == '7' || s.charAt(1) == '7' || s.charAt(2) == '7') result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}

