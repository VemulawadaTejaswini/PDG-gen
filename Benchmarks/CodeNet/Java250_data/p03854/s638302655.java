import java.util.*;
import static java.lang.Math.*;

public class Main {

	// 定数
	static final String a  = "dream";
	static final String b  = "dreamer";
	static final String c  = "erase";
	static final String d  = "eraser";

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		String s = sc.next();// 文字列

		// チェック
		String result = "";

		if(check(s)){
			result = "YES";
		}else{
			result = "NO";
		}

		// 出力
		System.out.println(result);
	}

	static boolean check(String s){
		return s.matches("(dream|dreamer|erase|eraser)+");
	}

}


