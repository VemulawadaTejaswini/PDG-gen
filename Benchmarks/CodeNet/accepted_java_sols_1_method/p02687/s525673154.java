import java.util.*;
import static java.lang.Math.*;

public class Main {
    
    static int[] a;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "ABC";
		if(s.equals(result)) result = "ARC";
		
		// 出力
		System.out.println(result);
	}
}
