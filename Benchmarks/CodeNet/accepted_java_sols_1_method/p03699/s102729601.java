import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    sum += a[i];
		}
		Arrays.sort(a);
		
		// 計算
		int result = 0;
		if(sum%10 != 0){
		    System.out.println(sum);
		    return;
		}
		for(int i = 0; i < n; i++){
		    if((sum - a[i])%10 != 0){
		        result = sum - a[i];
		        break;
		    }
		}

		// 出力
		System.out.println(result);
	}
}

