import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] march = new int[5];
		for(int i = 0; i < n; i++){
		    String s = sc.next();
		    if(s.charAt(0) == 'M') march[0]++;
		    if(s.charAt(0) == 'A') march[1]++;
		    if(s.charAt(0) == 'R') march[2]++;
		    if(s.charAt(0) == 'C') march[3]++;
		    if(s.charAt(0) == 'H') march[4]++;
		}
		
		// 計算
		long result = 0;
		for(int i = 0; i < 1<<5; i++){
		    if(Integer.bitCount(i) != 3) continue;
		    long cnt = 1;
		    for(int j = 0; j < 5; j++){
		        if(((i>>j)&1) == 1){
		            cnt *= (long)march[j];
		        }
		    }
		    result += cnt;
		}
		
		// 出力
		System.out.println(result);
	}
}


