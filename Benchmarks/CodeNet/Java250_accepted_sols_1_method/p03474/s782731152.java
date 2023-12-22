import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		// 計算
		String result = "No";
		String[] array = s.split("-");
		//System.out.println(Arrays.toString(array));
		if(array.length == 2 && array[0].length() == a && array[1].length() == b) result = "Yes";
		
		
		// 出力
		System.out.println(result);
	}
}


