import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int max_i = 0;
		int max = 0;
		int second_i = 0;
		int second = 0;
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    if(a[i] >= max){
		        second = max;
		        second_i = max_i;
		        max = a[i];
		        max_i = i;
		    }else if(a[i] >= second){
		        second = a[i];
		        second_i = i;
		    }
		}
		
		// 計算
		
		// 出力
		for(int i = 0; i < n; i++){
		    if(i == max_i){
                System.out.println(a[second_i]);
		    }else{
		        System.out.println(a[max_i]);
		    }
		}
	}

}
