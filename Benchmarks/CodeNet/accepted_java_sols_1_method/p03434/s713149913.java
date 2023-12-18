import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		// 計算
		int result = 0;
		for(int i = n-1; i >= 0; i--){
		    if(i%2 != n%2){
		        result += a[i];
		    }else{
		        result -= a[i];
		    }
		}
		
		// 出力
		System.out.println(result);
		
	}
}


