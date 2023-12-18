import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		int result = 0;
		for(int i = 0; i < s.length(); i=i+2){
		    boolean flg = true;
		    for(int j = 0; j < (s.length()-i-2)/2; j++){
		        if(s.charAt(j) != s.charAt((s.length()-i-2)/2 + j)) flg = false;
		    }
		    if(flg){
		        result = s.length()-i-2;
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
	}

}