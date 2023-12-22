import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int d = sc.nextInt();

		// 計算
	    String result = "";
		if(d == 25) result = "Christmas";
		if(d == 24) result = "Christmas Eve";
		if(d == 23) result = "Christmas Eve Eve";
		if(d == 22) result = "Christmas Eve Eve Eve";
		
		// 出力
		System.out.println(result);
        
	}
}
