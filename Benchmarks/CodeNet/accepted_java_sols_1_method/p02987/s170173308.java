import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "Yes";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++){
		    hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
		}
		for(Integer i : hm.values()){
		    if(i != 2) result = "No";
		}

		// 出力
		System.out.println(result);
	}
}
