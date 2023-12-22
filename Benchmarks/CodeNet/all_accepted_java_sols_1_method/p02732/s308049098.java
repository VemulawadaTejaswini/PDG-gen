import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] array = new int[n+1];
		int[] list = new int[n];
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    list[i] = a;
		    array[a]++;
		}
		
		// 計算
		long result = 0;
		for(int i = 0; i < n+1; i++){
		    int a = array[i];
		    result += (long)a*(a-1)/2;
		}
		
		for(int i = 0; i < n; i++){
		    long t = array[list[i]];
		    System.out.println(result - (t-1));
		}
		
		// 出力
		//System.out.println(result);
		
	}
}
