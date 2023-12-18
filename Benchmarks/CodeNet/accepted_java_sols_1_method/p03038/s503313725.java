import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeMap<Integer, Integer> a = new TreeMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
		    int key = sc.nextInt();
		    if(a.containsKey(key)){
		        a.put(key, a.get(key) + 1);
		    }else{
		        a.put(key, 1);
		    }
		}
	    for(int i = 0; i < m; i++){
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(a.containsKey(c)){
		        a.put(c, a.get(c) + b);
		    }else{
		        a.put(c, b);
		    }
		}
		
		// 計算
		long result = 0;
		int rest = n;
		while(n > 0){
		    Map.Entry<Integer, Integer> entry = a.pollLastEntry();
		    long key = entry.getKey();
		    long val = entry.getValue();
		    if(rest > val){
		        result += key * val;
		        rest -= val;
		    }else{
		        result += key * rest;
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}