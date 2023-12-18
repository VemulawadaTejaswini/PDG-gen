import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		int max = 0;
		for(int i = 0; i < n; i++){
		    String s = sc.next();
		    int cnt = tm.getOrDefault(s, 0) + 1;
		    tm.put(s, cnt);
		    max = max(max, cnt);
		}
		
		// 計算
		//String result = "Yes";
		for(String key : tm.keySet()){
		    //System.out.println(max);
		    if(tm.get(key).equals(max)) System.out.println(key);
		}
		
		// 出力
		//System.out.println(result);
	}
}
