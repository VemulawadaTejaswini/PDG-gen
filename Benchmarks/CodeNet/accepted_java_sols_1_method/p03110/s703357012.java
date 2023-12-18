import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		double result = 0;
		for(int i = 0; i < n; i++){
		    double x = sc.nextDouble();
		    String s = sc.next();
		    if(s.equals("JPY")){
		        result += x;
		    }else{
		        result += x * 380000;
		    }
		}
		// 計算

		// 出力
		System.out.println(result);
        
	}
}
