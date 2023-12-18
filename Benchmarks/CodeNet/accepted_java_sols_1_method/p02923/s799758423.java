import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] h = new int[n];
		int result = 0;
		int tmp = 0;
		for(int i = 0; i < n; i++){
    		h[i] = sc.nextInt();
    		if(i > 0){
    		    if(h[i] <= h[i - 1]){
    		        tmp++;
    		    }else{
    		        result = max(result, tmp);
    		        tmp = 0;
    		    }
    		}
		}
		result = max(result, tmp);


		// 計算

		// 出力
		System.out.println(result);
	}

}
