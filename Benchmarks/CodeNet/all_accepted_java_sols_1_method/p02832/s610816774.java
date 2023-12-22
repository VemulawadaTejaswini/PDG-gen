import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		int result = -1;
		int num = 1;
		int cnt = 0;
		boolean ok = false;
		for(int i = 0; i < n; i++){
		    if(a[i] == num){
		        num++;
		        ok = true;
		    }else{
		        cnt++;
		    }
		    
		}
		if(ok) result = cnt;
		//System.out.println(list.toString());
		
		// 出力
		System.out.println(result);
	}
}


