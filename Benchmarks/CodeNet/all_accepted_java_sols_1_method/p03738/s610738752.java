import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String a = sc.next();
		String b = sc.next();
		
		// 計算
		String result = "EQUAL";
		if(a.length() > b.length()) result = "GREATER";
		if(a.length() < b.length()) result = "LESS";
		if(a.length() == b.length()){
		    if(a.compareTo(b) > 0) result = "GREATER";
		    if(a.compareTo(b) < 0) result = "LESS";
		}
		
		// 出力
		System.out.println(result);
	}
}

