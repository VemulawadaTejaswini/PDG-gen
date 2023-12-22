import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] array = new int[n];
		HashMap<Integer, Long> map = new HashMap<Integer, Long>();
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    array[i] = a;
		    map.put(a, (long)map.getOrDefault(a, 0L) + 1);
		}
		
		// 計算
		long result = 0;
		//HashMap<Integer, Long> calMap = new HashMap<Integer, Long>();
		for(Integer key : map.keySet()){
		    long i = map.get(key);
		    long cnt = i*(i-1)/2;
		    result += cnt;
		}
		
		for(int i = 0; i < n; i++){
		    long t = map.get(array[i]);
		    System.out.println(result - (t-1));
		}
		
		// 出力
		//System.out.println(result);
		
	}
}
