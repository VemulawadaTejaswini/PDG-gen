import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String result = "YES";
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    if(hs.contains(a)){
		        result = "NO";
		    }else{
		        hs.add(a);
		    }
		}
		
		// 計算
		//int result = 0;
		
		// 出力
		System.out.println(result);
	}
}

