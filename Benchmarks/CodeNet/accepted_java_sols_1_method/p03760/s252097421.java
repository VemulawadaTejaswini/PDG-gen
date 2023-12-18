import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String o = sc.next();
		String e = sc.next();
		
		// 計算
		String result = "";
		StringBuilder sb = new StringBuilder();
		int n = o.length() + e.length();
		for(int i = 0; i < n; i++){
		    int index = i/2;
		    if(i%2 == 0) sb.append(o.charAt(index));
		    if(i%2 != 0) sb.append(e.charAt(index));
		}
		result = sb.toString();
		
		// 出力
		System.out.println(result);
	}
}

