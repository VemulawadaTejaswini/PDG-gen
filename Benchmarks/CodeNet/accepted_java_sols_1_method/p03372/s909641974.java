import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long c = sc.nextLong();
		long[][] xv = new long[n][2];
		for(int i = 0; i < n; i++){
		    xv[i][0] = sc.nextLong();
		    xv[i][1] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		long[] cal = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        cal[i+1] = cal[i] + xv[i][1] - (xv[i][0] - xv[i-1][0]); 
		    }else{
		        cal[i+1] = cal[i] + xv[i][1] - xv[i][0];
		    }
		}
		long[] rev = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        rev[i+1] = rev[i] + xv[n-1-i][1] - (xv[n-i][0] - xv[n-1-i][0]); 
		    }else{
		        rev[i+1] = rev[i] + xv[n-1-i][1] - (c - xv[n-1-i][0]);
		    }
		}
		long[] cal_return = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        cal_return[i+1] = cal_return[i] + xv[i][1] - 2*(xv[i][0] - xv[i-1][0]); 
		    }else{
		        cal_return[i+1] = cal_return[i] + xv[i][1] - 2*xv[i][0];
		    }
		}
		long[] rev_return = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        rev_return[i+1] = rev_return[i] + xv[n-1-i][1] - 2*(xv[n-i][0] - xv[n-1-i][0]); 
		    }else{
		        rev_return[i+1] = rev_return[i] + xv[n-1-i][1] - 2*(c - xv[n-1-i][0]);
		    }
		}
		long[] cal_max = new long[n+1];
		for(int i = 0; i < n+1; i++){
		    if(i == 0){
		        cal_max[i] = cal[i];
		    }else{
		        cal_max[i] = max(cal[i], cal_max[i-1]);
		    }
		}
		long[] rev_max = new long[n+1];
		for(int i = 0; i < n+1; i++){
		    if(i == 0){
		        rev_max[i] = rev[i];
		    }else{
		        rev_max[i] = max(rev[i], rev_max[i-1]);
		    }
		}
		for(int i = 0; i < n; i++){
		    result = max(result, cal_return[i] + max(0, rev_max[n-i]));
		    result = max(result, rev_return[i] + max(0, cal_max[n-i]));
		}
		
		// 出力
		System.out.println(result);
	}
}

