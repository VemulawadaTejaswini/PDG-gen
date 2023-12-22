import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long k = sc.nextLong();
		
		// 計算
		if(k <= 1){
		    System.out.println(2);
		    System.out.println((k+1) + " " + 0);
		    return;
		}else if(k <= 50){
		    long[] result = new long[(int)k];
		    int cnt = (int)k;
		    for(int i = 0; i < (int)k; i++){
		        result[i] = max(cnt, 0);
		        cnt--;
		    }
		    System.out.println(result.length);
		    for(int i = 0; i < result.length; i++){
		        System.out.print(result[i] + " ");
		    }
		}else{
		    long[] result = new long[50];
		    for(int i = 0; i < 50; i++){
		        long a = (k-(i+1))/50;
		        result[i] = 50-i+a;
		    }
		    System.out.println(result.length);
		    for(int i = 0; i < result.length; i++){
		        System.out.print(result[i] + " ");
		    }
		}
		
		// 出力
		//System.out.println(result);
	}

}


