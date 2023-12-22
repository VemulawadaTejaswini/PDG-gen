import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		String pre = "";
		String result = "Yes";
	    for(int i = 0; i < n; i++){
	        String now = sc.next();
	        if(i > 0){
	            if(list.contains(now)) result = "No";
	            if(pre.charAt(pre.length()-1) != now.charAt(0)) result = "No";
	        }
	        list.add(now);
	        pre = now;
	    }
		
		// 計算
		
		// 出力
		System.out.println(result);
		
	}
}
