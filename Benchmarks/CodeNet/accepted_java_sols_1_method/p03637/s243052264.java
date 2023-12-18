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
		
		// 計算
		String result = "No";
		int cnt4 = 0;
		int cnt2 = 0;
		for(int i = 0; i < n; i++){
		    if(a[i]%4 == 0){
		        cnt4++;
		    }else if(a[i]%2 == 0){
		        cnt2++;
		    }
		}
		if(cnt4 >= n/2) result = "Yes";
		if(cnt2 >= (n-cnt4*2)) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}

