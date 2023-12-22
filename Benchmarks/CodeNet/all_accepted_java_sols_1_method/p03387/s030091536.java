import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int[] abc = new int[3];
		abc[0] = sc.nextInt();
		abc[1] = sc.nextInt();
		abc[2] = sc.nextInt();
		Arrays.sort(abc);
		
		// 計算
		int result = 0;
		int r = abc[2] - abc[1];
		result += r;
		abc[0] += r;
		if((abc[2]-abc[0])%2 == 0){
		    result += (abc[2]-abc[0])/2;
		}else{
		    result += (abc[2]-abc[0])/2 + 2;
		}
		
		
		// 出力
		System.out.println(result);
		
		
	}

}


